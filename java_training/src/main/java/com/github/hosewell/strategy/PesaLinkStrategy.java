package com.github.hosewell.strategy;

public class PesaLinkStrategy implements PaymentStrategy {
    private String bankAccount;

    public PesaLinkStrategy(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via PesaLink to Account: " + bankAccount);
        System.out.println("Bank-to-Bank transfer initiated.");
    }
}