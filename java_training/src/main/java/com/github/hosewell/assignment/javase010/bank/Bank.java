package com.github.hosewell.assignment.javase010.bank;

public class Bank {
    private BankAccount activeAccount;

    // This method "stores" the account you just created
    public void addAccount(BankAccount account) {
        this.activeAccount = account;
        System.out.println("Account successfully linked to the bank system.");
    }

    // Main needs this to find the account for deposit/withdraw
    public BankAccount findAccount(String accountNumber) {
        if (activeAccount != null && activeAccount.getAccountNumber().equals(accountNumber)) {
            return activeAccount;
        }
        return null;
    }

    public void displayAllAccounts() {
        if (activeAccount != null) {
            System.out.println(activeAccount.toString());
        } else {
            System.out.println("No active account to display.");
        }
    }

    public void applyInterestToSavings() {
        if (activeAccount instanceof SavingsAccount) {
            ((SavingsAccount) activeAccount).applyInterest();
        } else {
            System.out.println("Current account is not a Savings Account.");
        }
    }
}