package com.github.hosewell.excercises.javase009;

public class UniversityPerson {
    protected String id;
    protected String name;
    protected String email;

    public UniversityPerson(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}
