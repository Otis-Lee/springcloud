package com.otis.springcloud.service.impl;

import com.otis.springcloud.dao.PaymentDao;
import com.otis.springcloud.entities.Payment;
import com.otis.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Otis
 * @date 2020/4/16/0016   22:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
