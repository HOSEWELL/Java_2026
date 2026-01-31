package com.github.hosewell.assignment.assessment2_hosewell.assessment5;

class User {
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(25);
        System.out.println("User age: " + user.getAge());
    }
}