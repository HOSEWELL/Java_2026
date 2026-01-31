package com.github.hosewell.assignment.assessment2_hosewell.assessment2;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("Hosewell", "MGR001", 80000, "Engineering");
        Developer dev = new Developer("Jane Smith", "DEV002", 60000, "Java");

        System.out.println("--- Manager Details ---");
        mgr.displayInfo();

        System.out.println("\n--- Developer Details ---");
        dev.displayInfo();
    }
}