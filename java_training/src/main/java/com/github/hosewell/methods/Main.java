package com.github.hosewell.methods;

public class Main {
    public static void main(String[] args) {
        // withoutMethods();
        reusableAreaCalculation();
        // calculateCircleArea(0);
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);

    }

    public static void withoutMethods() {
        final double PI = 3.14159;

        double radius1 = 5.0;    
        double area1 = PI * radius1 * radius1;
        System.out.println("Area1:" + area1);

        double radius2 = 7.0;    
        double area2 = PI * radius2 * radius2;
        System.out.println("Area2:" + area2);

        double radius3 = 10.0;    
        double area3 = PI * radius3 * radius3;
        System.out.println("Area3:" + area3);

    }

    public static void reusableAreaCalculation() {

        System.out.println("Area1 of circle with radius :" + 
        calculateCircleArea(5.0));

        System.out.println("Area2 of circle with radius :" + 
        calculateCircleArea(7.0));

        System.out.println("Area3 of circle with radius :" + 
        calculateCircleArea(10.0));
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        double result = PI * radius * radius;
        return result;
    }



    // now i want to connect a method inside operation folder and calculate area of square


    // factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}