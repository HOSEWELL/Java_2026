package com.github.hosewell.assignment.assessment2_hosewell.assessment5;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverloadingVsOverriding {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingVsOverriding math = new OverloadingVsOverriding();
        System.out.println("Overloading: " + math.add(5, 10));
        
        Dog myDog = new Dog();
        myDog.sound();
    }
}