package com.ecommerce.paymentservice.thirdparty.paymentgateway;

import com.ecommerce.paymentservice.thirdparty.paymentgateway.PaymentGateway;

public class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public String getPaymentLink(String orderId, Long amount) {
        return null;
    }
}
