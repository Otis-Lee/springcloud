package com.otis.springcloud.service;

import org.springframework.stereotype.Component;

@Component
class PaymentFallbackServiceImpl implements  PaymentHystrixService{
    @Override
    public String paymentInfoOk(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
