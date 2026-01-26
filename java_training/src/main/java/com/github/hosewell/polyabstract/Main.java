package com.github.hosewell.polyabstract;

public class Main {

    public static void main(String[] args) {
        Animal myCat = new Cat("Whiskers");
        Animal myDog = new Dog();
        

        printInfo(myCat); 
        printInfo(myDog);
    }

    public static void printInfo(Animal animal) {
        animal.makeSound(); 
    }
}