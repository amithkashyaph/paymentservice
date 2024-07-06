package com.ecommerce.paymentservice.controllers;

import com.ecommerce.paymentservice.dtos.InitiatePaymentRequestDto;
import com.ecommerce.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String getPaymentLink(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return null;
    }
}
