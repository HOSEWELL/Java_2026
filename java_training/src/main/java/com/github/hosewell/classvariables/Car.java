package com.github.hosewell.classvariables;


// class Car in oop


// access modifier class ClassName {
public class Car {
    public int id;
    public int regNo;
    public String color;
    public String model;

    public void startEngine() {
        System.out.println("Engine started for car ID: " + id);
    }

    public void stopEngine() {
        System.out.println("Engine stopped for car ID: " + id);
    }

    public int getRegNo() {
        return regNo;
    }   

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
}
