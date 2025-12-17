package org.ccasro.level3;


import org.ccasro.level3.caller.Store;
import org.ccasro.level3.gateway.PaymentGateway;
import org.ccasro.level3.payment.PaymentMethod;

public class Main {
    public static void main (String[] args) {

        PaymentGateway gateway = new PaymentGateway();
        Store store = new Store(gateway);

        PaymentMethod creditCard = (amount, callback) -> {
            System.out.println(" Credit Card Payment  = " + amount);
            if (amount <= 1000) callback.call("Credit Card transaction accepted!", true);
            else callback.call("Credit Card transaction denied: amount too high", false);
        };

        PaymentMethod paypal = (amount, callback) -> {
            System.out.println("Paypal payment = " + amount);
            callback.call("Paypal payment confirmed",true);
        };


        store.checkout(creditCard,1100);
        store.checkout(creditCard,1000);
        store.checkout(paypal,500);
    }
}
