package com.github.hosewell.excercises.javase009;

public class Staff extends UniversityPerson {
    private String position;
    private int workHours;

    public Staff(String id, String name, String email, String position, int workHours) {
        super(id, name, email);
        this.position = position;
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: " + position + ", Hours: " + workHours;
    }
}
