package com.otis.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Otis
 * @date 2020/4/17/0017   22:06
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class OrderHystrixFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixFeignMain80.class, args);
    }
}
