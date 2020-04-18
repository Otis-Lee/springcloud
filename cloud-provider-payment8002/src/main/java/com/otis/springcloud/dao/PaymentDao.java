package com.otis.springcloud.dao;

import com.otis.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Otis
 * @date 2020/4/16/ 22:12
 */
@Mapper
public interface PaymentDao {
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
