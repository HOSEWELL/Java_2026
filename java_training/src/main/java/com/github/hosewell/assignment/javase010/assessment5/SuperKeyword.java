package com.github.hosewell.assignment.javase010.assessment5;

class Parent {
    Parent() {
        System.out.println("Parent Constructor called");
    }
    
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    @Override
    void show() {
        super.show();
        System.out.println("Child show method");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}