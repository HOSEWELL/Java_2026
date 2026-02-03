package com.github.hosewell.datastructures.lists;

public class Account {
    private String accountName;
    private String accountNumber;
    private double balance;

    public Account(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Add this inside your Account.java class
    @Override
    public String toString() {
        return "Account[Name=" + accountName + ", Number=" + accountNumber + ", Balance=" + balance + "]";
    }

}
