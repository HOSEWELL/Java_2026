package com.github.hosewell.assignment.javase010.bank;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accNum, String holder, double balance, double limit) throws InvalidAmountException {
        super(accNum, holder, balance);
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal must be positive.");
        if (getBalance() + overdraftLimit < amount) {
            throw new InsufficientFundsException("Overdraft limit exceeded.");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return super.toString() + " [Overdraft Limit: $" + overdraftLimit + "]";
    }
}