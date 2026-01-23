package com.github.hosewell.inheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Animal animal = new Animal("Random Animal");

        dog.makeSound();
        cat.makeSound();
        animal.makeSound();

}

}
