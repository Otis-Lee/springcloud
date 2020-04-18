package com.otis.springcloud;

import com.sun.jmx.snmp.agent.SnmpMibAgentMBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.annotation.DeterminableImports;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Otis
 * @date 2020/4/17/0017   22:06
 */
@EnableFeignClients
@SpringBootApplication
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
