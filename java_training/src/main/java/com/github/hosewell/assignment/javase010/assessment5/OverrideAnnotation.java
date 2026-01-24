package com.github.hosewell.assignment.javase010.assessment5;

class Base {
    void display() {}
}

public class OverrideAnnotation extends Base {
    @Override
    void display() {
        System.out.println("The @Override ensures I am matching the parent method name exactly.");
    }
    
    public static void main(String[] args) {
        new OverrideAnnotation().display();
    }
}