package com.github.hosewell.dip;

public class Main {
    public static void main(String[] args) {
        // 1. Create the low-level tool
        DataRepository myDatabase = new PostgresRepository();

        // 2. "Inject" it into the high-level service
        StudentService service = new StudentService(myDatabase);

        // 3. Run the application
        service.completeEnrollment("Hosewell Karanja");
    }
}