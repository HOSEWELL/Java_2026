package com.github.hosewell.assignment.assessment3_hosewell.problem3;

public class Main {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics("E001", "Laptop", 999.99, 10, 24);
            laptop.displayProductInfo();

            System.out.println("Attempting to reduce stock...");
            laptop.reduceStock(5); 

        } catch (InvalidProductException | OutOfStockException e) {
       
            System.out.println("Error encountered: " + e.getMessage());
        }
    }
}