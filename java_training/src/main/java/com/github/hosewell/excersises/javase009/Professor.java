package com.github.hosewell.excersises.javase009;

public class Professor extends UniversityPerson {
    private String department;
    private double salary;

    public Professor(String id, String name, String email, String department, double salary) {
        super(id, name, email);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dept: " + department + ", Salary: $" + salary;
    }
}