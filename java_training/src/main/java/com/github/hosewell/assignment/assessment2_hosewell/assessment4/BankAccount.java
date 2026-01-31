package com.github.hosewell.assignment.assessment2_hosewell.assessment4;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}