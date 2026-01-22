package com.github.hosewell.encapsulation;

public class BankAccount {
    private double balance;
    private String accountNumber; 

    public BankAccount(double balance, String accountNumber) throws Exception {
        this.accountNumber = accountNumber;

        // Use the setter to ensure validation for private field
        this.setBalance(balance); 
    }

    public void printInfo() {
        System.out.println(accountNumber + " : " + balance);
    }

    public void setBalance(double balance) throws Exception {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new RuntimeException("Balance cannot be negative.");
        }
    }
}