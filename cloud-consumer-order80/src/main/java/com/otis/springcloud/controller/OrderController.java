package com.otis.springcloud.controller;


import com.otis.springcloud.entities.CommonResult;
import com.otis.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Otis
 * @date 2020/4/17/0017   01:12
 */
@RestController
@Slf4j
public class OrderController {

    //    private static final String URL = "http://localhost:8001";

    private static final String URL = "http://CLOUD-PROVIDER-PAYMENT";

    @Resource
    RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/getPaymentById/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL + "/getPaymentById/" + id, CommonResult.class);
    }

}
