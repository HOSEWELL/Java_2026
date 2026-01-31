package com.github.hosewell.assignment.assessment3_hosewell.problem4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement("Hosewell");

        try {
            // Test 1: Success
            emp.setSalary(5000.0);
            emp.displayInfo();

            // Test 2: Triggering the exception
            System.out.println("\nAttempting to set a negative salary...");
            emp.setSalary(-1000.0);

        } catch (InvalidSalaryException e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}