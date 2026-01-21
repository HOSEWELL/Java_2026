package com.github.hosewell.bank;

public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("12345", "Hosewell", 500.0);    
        System.out.println("Hosewell's Bank");


        myAccount.displayBalance();

        myAccount.deposit();  
        myAccount.withdraw(); 
        myAccount.displayBalance();
    }

}