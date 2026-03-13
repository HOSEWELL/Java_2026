package com.github.hosewell.singleton;

public class SchoolDatabase {
    // Singleton instance
    private static SchoolDatabase instance;
    private String connectionString;

    // 2. PRIVATE constructor: for our db, we want to control how it's created and prevent others from making new ones
    private SchoolDatabase() {
        this.connectionString = "school_db";
        System.out.println("--- Connection to PostgreSQL Opened ---");
    }

    // Created only once and shared by everyone
    public static SchoolDatabase getInstance() {
        if (instance == null) {
            instance = new SchoolDatabase(); 
        }
        return instance;
    }

    public void saveData(String studentName) {
        System.out.println("Saving " + studentName + " using connection: " + connectionString);
    }
}