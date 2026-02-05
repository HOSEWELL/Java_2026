package com.github.hosewell.excercises.javase016;


import java.util.*;

public class StudentDatabase {
    private Map<String, Student> studentMap = new HashMap<>();
    
    private Set<String> emailRegistry = new HashSet<>();

    public void registerStudent(Student s) {
        // Check if ID is already taken
        if (studentMap.containsKey(s.getId())) {
            System.out.println("Registration Failed: ID " + s.getId() + " already exists.");
            return;
        }

        // Check if Email is unique then .add() returns false if the item is already in the Set
        if (!emailRegistry.add(s.getEmail())) {
            System.out.println("Registration Failed: Email " + s.getEmail() + " is already in use.");
            return;
        }

        // If both checks pass, add to the database
        studentMap.put(s.getId(), s);
        System.out.println("Successfully registered: " + s.getName());
    }

    public void findStudentById(String id) {
        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Found: " + s);
        } else {
            System.out.println("Error: Student with ID " + id + " not found.");
        }
    }

    public void removeStudent(String id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            emailRegistry.remove(s.getEmail()); 
            System.out.println("Student " + id + " removed successfully.");
        } else {
            System.out.println("Error: Cannot remove. Student not found.");
        }
    }

    public void displayAll() {
        System.out.println("\n--- Current Student Records ---");
        for (Student s : studentMap.values()) {
            System.out.println(s);
        }
    }
}