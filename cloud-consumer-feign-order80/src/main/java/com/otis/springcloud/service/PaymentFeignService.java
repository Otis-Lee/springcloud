package com.otis.springcloud.service;

import com.otis.springcloud.entities.CommonResult;
import com.otis.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Otis
 * @date 2020/4/17/0017   22:08
 */
@FeignClient("CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping("/getPaymentById/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") long id);
}
