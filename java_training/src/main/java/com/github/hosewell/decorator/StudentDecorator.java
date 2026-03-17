package com.github.hosewell.decorator;

public abstract class StudentDecorator implements Student {
    protected Student tempStudent; 

    public StudentDecorator(Student student) {
        this.tempStudent = student;
    }

    public String getDescription() { return tempStudent.getDescription(); }
    public double getFees() { return tempStudent.getFees(); }
    
}
