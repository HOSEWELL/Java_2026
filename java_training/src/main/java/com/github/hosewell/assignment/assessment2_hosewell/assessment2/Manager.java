package com.github.hosewell.assignment.assessment2_hosewell.assessment2;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}