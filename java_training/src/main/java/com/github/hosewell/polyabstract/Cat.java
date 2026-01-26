package com.github.hosewell.polyabstract;

public class Cat extends Animal {
    private String name;    

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow");
    }
}