package com.github.hosewell.assignments.javase007;
import java.util.Scanner;

public class Account {
    public String accountNumber;
    public String accountHolder;
    public double balance;


    // Default constructor
    public Account() {
        this.accountNumber = "000000";
        this.accountHolder= "Default Name";
        this.balance = 0.0;
    }
    // Constructor with account number and Account holder name
    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Constructor with all properties
    public Account( String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance; 
    }

    // logic for calculation of account info after deposit withdrawal and see balance

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit into " + accountHolder + "'s account: ");
        double amount = input.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Success! New balance is: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // NEW Withdraw Method: No parameters, uses a prompt instead
    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Transaction failed: Insufficient funds or invalid amount.");
        }

    }

    public void displayBalance() {
        System.out.println("\n--- " + accountHolder + " (" + accountNumber + ") ---");
        System.out.println("Current Balance: $" + balance);
    }

}
