package com.github.hosewell.factory;

public class UniversityStudent implements Student {
    @Override
    public void attendClass() {
        System.out.println("University Student: Attending a Java Advanced Design Patterns lecture.");
    }
}