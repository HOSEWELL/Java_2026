package com.github.hosewell.excersises.javase008;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.matches("[A-Za-z0-9]{6}")) {
            this.studentId = studentId;
        } else {
            System.out.println("Error: Student ID must be exactly 6 alphanumeric characters");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name;
        } else {
            System.out.println("Error: Name must be at least 2 characters.");
            this.name = "Invalid Name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 16 and 100.");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0.");
        }
    }

    public void displayInfo() {
        System.out.println("\n Student Record ");
        System.out.println("ID:   " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
        System.out.println("GPA:  " + gpa);
    }
}
