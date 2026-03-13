package com.github.hosewell.singleton;

public class Main {
    public static void main(String[] args) {
        // Get the "one and only" database instance
        SchoolDatabase db1 = SchoolDatabase.getInstance();
        db1.saveData("Hosewell");

        // Try to get it again somewhere else in the app
        SchoolDatabase db2 = SchoolDatabase.getInstance();
        db2.saveData("John Doe");


        if (db1 == db2) {
            System.out.println("SUCCESS: db1 and db2 are the exact same instance!");
        }
    }
}