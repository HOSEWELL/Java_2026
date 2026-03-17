package com.github.hosewell.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentMethod;

    // This allows us to change the strategy at RUNTIME
    public void setPaymentMethod(PaymentStrategy method) {
        this.paymentMethod = method;
    }

    public void checkout(double total) {
        paymentMethod.pay(total);
    }
}