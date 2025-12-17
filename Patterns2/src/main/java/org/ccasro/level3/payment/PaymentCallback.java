package org.ccasro.level3.payment;

@FunctionalInterface
public interface PaymentCallback {
    void call(String message, boolean success);
}
