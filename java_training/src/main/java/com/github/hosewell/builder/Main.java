package com.github.hosewell.builder;

public class Main {
    public static void main(String[] args) {
        
        // This is a "Fluent Interface"
        Intern myIntern = Intern.InternBuilder.start()
                            .setFirstName("Hosewell")
                            .setLastName("Karanja")
                            .setDepartment("Software Development")
                            .build();

        System.out.println(myIntern);
    }
}