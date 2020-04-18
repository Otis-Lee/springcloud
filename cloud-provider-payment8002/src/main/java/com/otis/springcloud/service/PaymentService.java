package com.otis.springcloud.service;


import com.otis.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Otis
 * @date 2020/4/16/0016   22:32
 */
public interface PaymentService  {
    /**
     * @param payment payment
     * @return int
     */
    public int create(Payment payment);

    /**
     *
     * @param id 支付id
     * @return Payment
     */
    public Payment getPaymentById(@Param("id") long id);

}
