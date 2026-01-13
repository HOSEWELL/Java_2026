package com.github.hosewell;

import com.github.hosewell.variables.string;

public class Student {

    private String name;
    private int age;
    
    // Arrays
    String[] subjects = {"Math", "Science", "History"};
    int[] grades = {90, 85, 88};
    
    // Constants with a final keyword
    private final double PI = 3.14;
    
    public Student() {
        int DAZAN = 12;
        DAZAN = 15;
        System.out.println("Constant DAZAN: " + DAZAN);
        System.out.println("Constant PI: " + PI);
    }
}

