package com.otis.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.otis.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author likan
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfoOk(id);
    }

//    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
//        return paymentHystrixService.paymentInfoTimeOut(id);
//    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand
          /*  (
            fallbackMethod = "paymentTimeOutFallbackMethod",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })*/
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
//        int i = 10/0;
        return paymentHystrixService.paymentInfoTimeOut(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费者80，对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己，o(╥﹏╥)o";
    }

    /**
     * 全局fallback方法
     * @return STRING
     */
    public String paymentGlobalFallbackMethod(){
        return "Global异常处理信息，请稍后再试，o(╥﹏╥)o";
    }
}
