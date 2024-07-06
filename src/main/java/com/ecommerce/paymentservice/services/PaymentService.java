package com.ecommerce.paymentservice.services;

import com.ecommerce.paymentservice.thirdparty.paymentgateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    @Autowired
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String emailId) {
        return null;
    }
}
