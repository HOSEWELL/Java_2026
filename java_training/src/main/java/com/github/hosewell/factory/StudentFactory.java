package com.github.hosewell.factory;

public class StudentFactory {
    // This method is the "counter" where you place your order
    public static Student getStudent(String studentType) {
        if (studentType == null) {
            return null;
        }
        if (studentType.equalsIgnoreCase("PRIMARY")) {
            return new PrimaryStudent();
        } else if (studentType.equalsIgnoreCase("UNIVERSITY")) {
            return new UniversityStudent();
        }
        return null;
    }
}