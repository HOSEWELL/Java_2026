package com.github.hosewell.assignment.javase010.assessment5;

class BankSystem {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }
}

public class Maintainability {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        System.out.println("Balance access remains the same even if internal logic changes: " + bank.getBalance());
    }
}