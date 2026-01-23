package com.github.hosewell.inheritance;

public class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("All animal makes sound");
    }
}
