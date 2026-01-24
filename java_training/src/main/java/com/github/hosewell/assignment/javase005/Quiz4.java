package com.github.hosewell.assignment.javase005;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();

            if (number > 0) {
                isValid = true;
            } else {
                System.out.print("Invalid input! ");
            }
        }


        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}
