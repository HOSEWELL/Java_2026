package com.github.hosewell.assignment.javase010.assessment4;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S101", "Hosewell", 150, 2.5);
        CheckingAccount checking = new CheckingAccount("C202", "Hosewell", 50, 500);

        System.out.println("Savings");
        savings.withdraw(60); 
        savings.applyInterest();
        System.out.println("Savings Balance: $" + savings.getBalance());

        System.out.println("\n Checking Test");
        checking.withdraw(200); 
        System.out.println("Checking Balance: $" + checking.getBalance());
    }
}