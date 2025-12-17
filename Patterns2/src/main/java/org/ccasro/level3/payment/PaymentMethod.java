package org.ccasro.level3.payment;

@FunctionalInterface
public interface PaymentMethod {
    void pay(double amount, PaymentCallback callback);
}
