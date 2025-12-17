package org.ccasro.level3.caller;

import org.ccasro.level3.gateway.PaymentGateway;
import org.ccasro.level3.payment.PaymentMethod;

public class Store {

    private PaymentGateway gateway;

    public Store(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void checkout(PaymentMethod method, double amount){
        System.out.println("store: processing payment...");
        gateway.processPayment(method,amount,((message, success) -> {
            if (success) System.out.println ("store: payment processed -> " + message);
            else System.out.println("store: payment failed -> " + message);
        }));
    }
}
