package com.github.hosewell.dip;

public class Main {
    public static void main(String[] args) {
        // Create the low-level tool
        
        // DataRepository myDatabase = new TextFileRepository();
    
        DataRepository myDatabase = new PostgresRepository();
        StudentService service = new StudentService(myDatabase);

        service.completeEnrollment("Hosewell Karanja");
    }
}