package com.github.hosewell.factory;

public class Main {
    public static void main(String[] args) {
        // We don't use 'new PrimaryStudent()'. We ask the factory!
        Student s1 = StudentFactory.getStudent("PRIMARY");
        s1.attendClass();

        Student s2 = StudentFactory.getStudent("UNIVERSITY");
        s2.attendClass();
    }
}