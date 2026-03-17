package com.github.hosewell.strategy;

public class MpesaStrategy implements PaymentStrategy {
    private String phoneNumber;

    public MpesaStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using M-Pesa (Phone: " + phoneNumber + ")");
        System.out.println("STK Push sent... PIN requested.");
    }
}