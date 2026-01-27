package com.github.hosewell.excercises.javase011;

public class PensionCalculator {
    private double monthlySalary;
    // We use a constant for the percentage (5%)
    private static final double PENSION_RATE = 0.05;

    public PensionCalculator(double monthlySalary) {
        setMonthlySalary(monthlySalary);
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // This is the core logic
    public double calculateMonthlyContribution() {
        return this.monthlySalary * PENSION_RATE;
    }

    public void displayPensionInfo() {
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Monthly Pension Contribution (5%): $" + calculateMonthlyContribution());
    }
}