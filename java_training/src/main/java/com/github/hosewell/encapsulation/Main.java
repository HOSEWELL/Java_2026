package com.github.hosewell.encapsulation;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(1000.0, "001");

        // bankAccount.balance = -1000;
        bankAccount.setBalance(-1000);
        bankAccount.printInfo();

    }
}
