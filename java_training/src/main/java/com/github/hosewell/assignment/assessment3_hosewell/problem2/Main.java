package com.github.hosewell.assignment.assessment3_hosewell.problem2;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
        BankAccount account2 = new BankAccount("ACC002", "Bob", 500);

        try {
            account1.deposit(500); 

            account1.withdraw(2000); 

            account1.transfer("INVALID_ID", 100, null); 

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed.");
        }
    }
}