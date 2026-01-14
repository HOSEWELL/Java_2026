package com.github.hosewell.userinput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 0.0;

        // deposits
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = scanner.nextDouble();
        System.err.println("Amount to deposit: " + amountToDeposit);

        balance += amountToDeposit;
        System.out.println("Current balance: " + balance);

        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        scanner.nextLine();
         // when you use nextLine after nextInt or nextDouble you need an extra nextLine to consume the newline character
        // scanner.nextLine();
        System.err.println("Amount to withdraw: " + amountToWithdraw);

        System.out.print("Enter Withdrawal charges : ");
        double withdrawalCharges = scanner.nextDouble();
        scanner.nextLine();
        System.err.println("Withdrawal charges: " + withdrawalCharges);

        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();   
        System.err.println("Customer name: " + customerName);

        System.out.print("Customer Age: ");
        int customerAge = scanner.nextInt();
        scanner.nextLine();
        System.err.println("Customer Age: " + customerAge);

        System.out.println("New balance after withdrawal and charges for " + customerName + ":");
        balance -= amountToWithdraw + withdrawalCharges;
        System.out.println("Current balance: " + balance);


        // close the scanner
        scanner.close();
        
    }
    
}
