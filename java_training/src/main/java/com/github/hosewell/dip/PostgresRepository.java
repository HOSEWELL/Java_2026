package com.github.hosewell.dip;

public class PostgresRepository implements DataRepository {
    @Override
    public void save(String studentName) {
        System.out.println("Connecting to PostgreSQL...");
        System.out.println("Executing: INSERT INTO students (name) VALUES ('" + studentName + "')");
    }
}