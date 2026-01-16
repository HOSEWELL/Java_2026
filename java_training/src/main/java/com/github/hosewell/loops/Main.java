package com.github.hosewell.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for loops

        // iLoveYouMumAndDad();
        // forLoop();
        // whileLoop();
        // whileLoopWithCounter();
        // doWhileLoop();
        // breakingStatements();
        continueStatements();

    }

    static void iLoveYouMumAndDad() {
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
        System.out.println("I Love You Mum And Dad");
    }

    static void forLoop() {
        // for ("initialExpression; testExpression;updateExpression")
        for (int counter = 1; counter <= 100; counter++) {
            System.out.println("I Love You Mum And Dad");

        }
    }

    static void whileLoop() {

        // Show menu
        // Tea
        // Andazi
        // Chapati
        // Exit

        Scanner scanner = new Scanner(System.in);

        boolean showMenu = true;

        System.out.println("Hosewell HOTELS:");

        while (showMenu) {
            System.out.println("1. Tea");
            System.out.println("2. Andazi");
            System.out.println("3. Chapati");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                showMenu = false;
                System.out.println("Thank you for visiting Hosewell HOTELS. Goodbye!");
                break;
            }

            System.out.println("You selected option: " + choice);

            scanner.nextInt();
        }
        scanner.close();
    }

    static void whileLoopWithCounter() {
        int counter = 1;

        while (counter <= 10) {
            System.out.println("I Love You Mum And Dad");
            counter++;
        }
    }

    static void doWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Play Game");
            System.out.println("2. View Scores");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Starting the game... 🎮");
            } else if (choice == 2) {
                System.out.println("Viewing high scores... 🏆");
            } else if (choice == 3) {
                System.out.println("Preparing to leave...");
            } else {
                System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 3); // The loop continues as long as choice is NOT 3

        System.out.println("Exiting... Thank you for playing!");
        scanner.close();
    }

    static void breakingStatements() {
        // array of numbers
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        for (int counter = 0; counter < numbers.length; counter++) {
            int number = numbers[counter];

            if (number == 70) {
                System.out.println("Found 70.");
                break; // exit the loop when 70 is found
            }
            System.out.println("Number: " + numbers[counter]);
        }
    }

    static void continueStatements() {
        System.out.println("Prime numbers between 1 and 50:");

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            // Check if 'i' is divisible by any number 'j'
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // We found a factor, so it's not prime
                    break; // Exit the inner loop early
                }
            }

            // If it's NOT prime, we use 'continue' to skip the print statement
            if (!isPrime) {
                continue;
            }

            // This line only runs if 'continue' was not triggered
            System.out.print(i + " ");
        }
        System.out.println(); // New line at the end
    }
}