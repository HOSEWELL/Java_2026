package com.github.hosewell.excercises.javase016;

public class Main {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        // 1. Valid Registrations
        db.registerStudent(new Student("S001", "Hosewell", "hosewe@example.com"));
        db.registerStudent(new Student("S002", "Alice", "alice@example.com"));

        // 2. Testing Duplicate Email 
        db.registerStudent(new Student("S003", "Bob", "hosewell@example.com"));

        // 3. Testing Duplicate ID 
        db.registerStudent(new Student("S001", "Charlie", "charlie@example.com"));

        // 4. Searching
        db.findStudentById("S001");
        db.findStudentById("S999"); // Doesn't exist so i expect error message

        db.displayAll();
    }
}
