package com.github.hosewell.decorator;

public class Main {
    public static void main(String[] args) {
        Student student = new BasicStudent();
        student = new SportsDecorator(student);

        // Wrap them again in a Library membership (if you had that decorator)
        // student = new LibraryDecorator(student);
        System.out.println(student.getDescription());
        System.out.println("Total Fees: " + student.getFees());
    }
}
