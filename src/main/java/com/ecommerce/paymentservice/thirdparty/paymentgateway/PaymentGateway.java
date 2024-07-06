package com.ecommerce.paymentservice.thirdparty.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String getPaymentLink(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException;
}
