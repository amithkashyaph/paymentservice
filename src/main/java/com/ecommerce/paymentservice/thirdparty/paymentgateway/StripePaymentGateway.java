package com.ecommerce.paymentservice.thirdparty.paymentgateway;

public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String getPaymentLink(String orderId, Long amount, String phoneNumber, String email) {
        return null;
    }
}
