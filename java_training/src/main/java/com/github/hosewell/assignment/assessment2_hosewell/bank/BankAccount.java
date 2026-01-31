package com.github.hosewell.assignment.assessment2_hosewell.bank;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) throw new InvalidAmountException("Initial balance cannot be negative.");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    protected void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Deposit amount must be positive.");
        balance += amount;
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;

    @Override
    public String toString() {
        return "Acc: " + accountNumber + " | Holder: " + accountHolder + " | Balance: $" + balance;
    }
}