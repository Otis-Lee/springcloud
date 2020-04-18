package com.otis.springcloud;

import com.otis.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Otis
 * @date 2020/4/17/0017   01:08
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT", configuration = MyRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
