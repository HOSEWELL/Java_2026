package com.github.hosewell.classvariables;

import java.util.logging.Logger;

public class Main {

    public static String config = "home/user/bin";
    private static Logger logger = Logger.getLogger(config);

    public static void main(String[] args) {
        System.out.println("Config path: " + config);
        
        logger.info("Program started with config: " + config);

        printVariable();

        Main myProgram = new Main(); 
        myProgram.carInfo();
    }

    public static void printVariable() {
        System.out.println("Accessing shared config: " + config);
        int a = 20; 
        System.out.println("Local variable a is: " + a);
    }

    public void carInfo() {
        
        Car car = new Car();
        car.id = 20;
        car.regNo = 12345;
        car.color = "Red";
        car.model = "Toyota";
        
        System.out.println("Car info: " + car.model + ", Color: " + car.color + ", ID: " + car.id);



        Car forester = new Car();
        forester.id = 30;
        forester.color = "Blue";
        forester.model = "Subaru";  
        System.out.println("Car info: " + forester.model + ", Color: " + forester.color + ", ID: " + forester.id);

        forester.startEngine();        
        car.stopEngine();
    }


}