package com.ecommerce.paymentservice.thirdparty.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String getPaymentLink(String orderId, Long amount) throws RazorpayException;
}
