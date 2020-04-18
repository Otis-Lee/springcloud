package com.otis.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Otis
 * @date 2020/4/17/0017   16:39
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentZookeeper(){
        return "spring cloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
