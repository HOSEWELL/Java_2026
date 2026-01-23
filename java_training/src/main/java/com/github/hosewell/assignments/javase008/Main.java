package com.github.hosewell.assignments.javase008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Student Registration System ===");

        Student student = new Student("000000", "Initial", 18, 0.0);

        System.out.print("Enter Student ID: ");
        String idInput = scanner.next();
        student.setStudentId(idInput); 

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String nameInput = scanner.nextLine();
        student.setName(nameInput);

        System.out.print("Enter Age: ");
        int ageInput = scanner.nextInt();
        student.setAge(ageInput);

        System.out.print("Enter GPA: ");
        double gpaInput = scanner.nextDouble();
        student.setGpa(gpaInput);

        // System.out.println("\n--- Verification Complete ---");
        student.displayInfo();

        scanner.close();
    }
}