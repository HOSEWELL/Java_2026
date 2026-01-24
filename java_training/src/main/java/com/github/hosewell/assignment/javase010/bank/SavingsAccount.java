package com.github.hosewell.assignment.javase010.bank;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accNum, String holder, double balance, double rate) throws InvalidAmountException {
        super(accNum, holder, balance);
        this.interestRate = rate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal must be positive.");
        if (getBalance() - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Minimum balance of $100 required.");
        }
        setBalance(getBalance() - amount);
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
    }
}