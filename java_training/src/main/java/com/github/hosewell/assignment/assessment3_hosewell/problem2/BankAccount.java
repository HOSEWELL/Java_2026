package com.github.hosewell.assignment.assessment3_hosewell.problem2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance: " + balance);
        }
        balance -= amount;
    }

    public void transfer(String toAccountNum, double amount, BankAccount targetAccount) 
            throws InsufficientFundsException, AccountNotFoundException {
        
        if (targetAccount == null || !toAccountNum.equals(targetAccount.getAccountNumber())) {
            throw new AccountNotFoundException("Account " + toAccountNum + " not found.");
        }
        
        this.withdraw(amount); 
        targetAccount.deposit(amount);
    }

    public String getAccountNumber() { return accountNumber; }
}