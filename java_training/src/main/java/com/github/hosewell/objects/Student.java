package com.github.hosewell.objects;


public class Student {
    public String name;
    public int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
       
    }

   public void displayInfo() {
       System.out.println("Student Name is: " + name + ", Age: " + age);
   }
}
