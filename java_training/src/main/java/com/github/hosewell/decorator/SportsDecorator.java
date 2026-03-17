package com.github.hosewell.decorator;

public class SportsDecorator extends StudentDecorator {
    public SportsDecorator(Student student) { super(student); }

    @Override
    public String getDescription() {
        return tempStudent.getDescription() + ", Joined Sports Club";
    }

    @Override
    public double getFees() {
        return tempStudent.getFees() + 2500.0; // sports fee
    }
}
