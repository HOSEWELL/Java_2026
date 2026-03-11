package com.github.hosewell.dip;

public class StudentService {
    // Notice we use the Interface type here, NOT PostgresRepository
    private DataRepository repo;

    // This is "Constructor Injection"
    public StudentService(DataRepository repo) {
        this.repo = repo;
    }

    public void completeEnrollment(String name) {
        System.out.println("Processing business logic for: " + name);
        repo.save(name);
    }
}
