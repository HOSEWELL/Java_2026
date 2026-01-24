package com.github.hosewell.assignment.javase010.assessment3;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println("Result 1: " + sc.add(10, 20));
        System.out.println("Result 2: " + sc.add(10, 20, 30));
        System.out.println("Result 3: " + sc.add(10.5, 20.5));
        System.out.println("Result 4: " + sc.add("Hello ", "Java"));

        System.out.println("Power: " + sc.power(2, 3));
        System.out.println("Square Root: " + sc.squareRoot(16));
    }
}