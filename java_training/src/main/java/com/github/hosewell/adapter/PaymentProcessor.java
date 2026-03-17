package com.github.hosewell.adapter;

public interface PaymentProcessor {
    // Our new system expects a simple "pay" method with an amount
    void pay(double amount);
}