package com.github.hosewell.dip;

public class StudentService {

    private DataRepository repo;

    // "Constructor Injection"
    public StudentService(DataRepository repo) {
        this.repo = repo;
    }

    public void completeEnrollment(String name) {
        System.out.println("Processing business logic for: " + name);
        repo.save(name);
    }
}
