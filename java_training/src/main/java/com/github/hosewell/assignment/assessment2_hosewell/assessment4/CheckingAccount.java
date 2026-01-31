package com.github.hosewell.assignment.assessment2_hosewell.assessment4;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: $" + amount + " (Using overdraft if necessary)");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}