package com.github.hosewell.excersises.javase009;

public class Student extends UniversityPerson {
    private String major;
    private double gpa;

    public Student(String id, String name, String email, String major, double gpa) {
        super(id, name, email); 
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    
    public String toString() {
        return super.toString() + ", Major: " + major + ", GPA: " + gpa;
    }
}
