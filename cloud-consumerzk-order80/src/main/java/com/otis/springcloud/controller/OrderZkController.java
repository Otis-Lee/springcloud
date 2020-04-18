package com.otis.springcloud.controller;

import com.otis.springcloud.entities.CommonResult;
import com.otis.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Otis
 * @date 2020/4/17/0017   20:00
 */
@RestController
@Slf4j
public class OrderZkController {

    private static final String URL = "http://cloud-provider-payment";

    @Resource
    RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(URL + "/payment/zk", String.class);
        return result;
    }


}
