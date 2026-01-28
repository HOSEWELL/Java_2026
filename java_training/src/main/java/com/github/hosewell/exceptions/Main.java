package com.github.hosewell.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserInput();
    }

    public static void UserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("Enter your Age: ");

        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You can apply for ID.");
        } else {
            System.out.println("You are still a minor");
        }

        } catch (InputMismatchException e) {
            System.out.println("Exception Happened: " + e.getMessage());
            UserInput();
        }

        scanner.close();
        
    }
}
