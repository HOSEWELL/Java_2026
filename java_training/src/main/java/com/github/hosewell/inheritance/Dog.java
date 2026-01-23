package com.github.hosewell.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("A dog barks: Woof Woof");
    }

}