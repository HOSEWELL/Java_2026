package com.github.hosewell.decisions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Registration Logic (If-Else)
        final int QUALIFICATION_AGE = 18;
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (age >= QUALIFICATION_AGE) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your location: ");
            String location = scanner.next();
            System.out.println("You are now registered, " + name + " from " + location + ".");
            
            // Proceed to other features only if registered
            System.out.println("\n--- Grading System ---");
            gradeSystem(scanner);

            System.out.println("\n--- Order System ---");
            orderStatusSystem(scanner);

        } else {
            System.out.println("You must be at least " + QUALIFICATION_AGE + " years old to register.");
        }

        System.out.println("\nProgram finished.");
        scanner.close();
    }

    // 2. Grading System (Else-If Ladder)
    private static void gradeSystem(Scanner scanner) {
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 80) {
            System.out.println("Result: Grade A");
        } else if (score >= 70) {
            System.out.println("Result: Grade B");
        } else if (score >= 60) {
            System.out.println("Result: Grade C");
        } else if (score >= 50) {
            System.out.println("Result: Grade D");
        } else {
            System.out.println("Result: Grade E");
        }
    }

    // 3. Order System (Switch Statement)
    private static void orderStatusSystem(Scanner scanner) {
        System.out.println("Select Order Status (1-4):");
        System.out.println("1. Placed\n2. Shipped\n3. Out for Delivery\n4. Delivered");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Status: Your order has been placed and is being processed.");
                break;
            case 2:
                System.out.println("Status: Your order has left our Shop.");
                break;
            case 3:
                System.out.println("Status: Your order is with the courier and will arrive soon!");
                break;
            case 4:
                System.out.println("Status: Package delivered. Enjoy!");
                break;
            default:
                System.out.println("Invalid selection. Please choose 1-4.");
                break;
        }


        // Java 14+ Switch Expression Example

        String orderStatus = "Shipped";
        switch (orderStatus) {
            case "Placed" -> System.out.println("Order placed successfully.");
            case "Shipped" -> System.out.println("Your order has been shipped.");
            case "Out for Delivery" -> System.out.println("Your order is with the courier and will arrive soon!");
            case "Delivered" -> System.out.println("Package delivered. Enjoy!");
    }   

         String response = "01"; 
         switch (response) {
           case "01", "1" -> System.out.println("You selected option 1.");
           case "02", "2" -> System.out.println("You selected option 2.");
         }
}
}