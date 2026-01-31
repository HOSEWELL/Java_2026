package com.github.hosewell.assignment.assessment1_hosewell;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        int c = 7;

        int sum = a + b + c;
        
        int product = a * b;
        
        int combinedResult = (a + b) * c;
        
        int remainder = a % b;
        
        System.out.println("Sum of all three: " + sum);
        System.out.println("Product of a and b: " + product);
        System.out.println("Result of (a + b) * c: " + combinedResult);
        System.out.println("Remainder of a / b: " + remainder);
    }
}