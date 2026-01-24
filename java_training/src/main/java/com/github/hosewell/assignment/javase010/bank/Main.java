package com.github.hosewell.assignment.javase010.bank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n Hosewell Bank Menu ");
            System.out.println("1. Create Account | 2. Deposit | 3. Withdraw | 4. View Details | 5. Apply Interest | 6. Exit");
            System.out.print("Select: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            try {
                if (choice == 1) {
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Initial Deposit: ");
                    double bal = scanner.nextDouble();
                    
                    // Default for Savings
                    bank.addAccount(new SavingsAccount(id, name, bal, 3.5)); 
                    
                } else if (choice == 2) {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    BankAccount acc = bank.findAccount(id);
                    if (acc != null) {
                        System.out.print("Amount to Deposit: ");
                        acc.deposit(scanner.nextDouble());
                    }

                } else if (choice == 3) {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    BankAccount acc = bank.findAccount(id);
                    if (acc != null) {
                        System.out.print("Amount to Withdraw: ");
                        acc.withdraw(scanner.nextDouble());
                    }

                } else if (choice == 4) {
                    bank.displayAllAccounts();

                } else if (choice == 5) {
                    bank.applyInterestToSavings();

                } else if (choice == 6) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}