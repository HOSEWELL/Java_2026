package com.github.hosewell.assignment.assessment2_hosewell.assessment3;

public class ScientificCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Performing scientific addition for: " + a + " + " + b);
        return super.add(a, b);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}