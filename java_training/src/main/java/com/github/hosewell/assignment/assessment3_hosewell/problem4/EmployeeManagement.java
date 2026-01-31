package com.github.hosewell.assignment.assessment3_hosewell.problem4;

public class EmployeeManagement {
    public static String companyName = "TechCorp";
    private String employeeName;
    private double salary;

    public EmployeeManagement(String name) {
        this.employeeName = name;
    }

    // Fixed shadowing and added Exception handling
    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative: " + salary);
        }
        this.salary = salary; 
    }

    // Changed return type from void to double
    public double calculateBonus() {
        return this.salary * 0.1;
    }

    public void displayInfo() {
        System.out.println("Employee: " + employeeName + " | Company: " + companyName + " | Salary: $" + salary + " | Bonus: $" + calculateBonus());
    }
}