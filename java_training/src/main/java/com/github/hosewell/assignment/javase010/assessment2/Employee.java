package com.github.hosewell.assignment.javase010.assessment2;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getId() { return id; }
    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        }
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary + " | Bonus: " + calculateBonus());
    }
}