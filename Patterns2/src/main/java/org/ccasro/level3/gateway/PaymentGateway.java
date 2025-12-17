package org.ccasro.level3.gateway;

import org.ccasro.level3.payment.PaymentCallback;
import org.ccasro.level3.payment.PaymentMethod;

public class PaymentGateway {

    public void processPayment(PaymentMethod method, double amount, PaymentCallback callback) {
        System.out.println("Loading payment process...");
        method.pay(amount,callback);
        System.out.println("Payment finished");
    }
}
