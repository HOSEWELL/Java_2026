package com.github.hosewell.strategy;

public class VisaStrategy implements PaymentStrategy {
    private String cardNumber;

    public VisaStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Visa Card: " + cardNumber);
    }
}