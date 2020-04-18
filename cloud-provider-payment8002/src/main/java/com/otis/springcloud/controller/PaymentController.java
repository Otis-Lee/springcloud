package com.otis.springcloud.controller;



import com.otis.springcloud.entities.CommonResult;
import com.otis.springcloud.entities.Payment;
import com.otis.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Otis
 * @date 2020/4/16/0016   22:38
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入成功：" + result);

        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功,server port: " + serverPort, result);
        }else {
            return new CommonResult<>(444, "插入数据失败", null);
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);

        if (payment != null ) {
            return new CommonResult<>(200, "查询成功,server port: " + serverPort, payment);
        }else {
            return new CommonResult<>(444, "没有对应记录,查询ID： " + id, null);
        }
    }
}
