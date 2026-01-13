package com.github.hosewell.variables;

public class Main {
    public static void main(String[] args) {
        int myNumber = 5;
        String myString = "Hello, World!";
        double myDouble = 5.99;
        boolean myBoolean = true;


//  different ways to declare variables - dollar sign underscore and normal way
        String $name = "Hosewell";
        String _greeting = "Welcome!";

        int AGE = 25;
        int age = 30;
        int Age = 35;

        // pass example variables to print statement

        boolean isPassed = true;

        // it will still work even if we declare and assign in separate lines
        boolean isFailed;
        isFailed = false;

        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);


        // Print example variables
        //  Bytes range from (-128 to 127)

        byte b=100;
        System.out.println("Byte: " + b);

        // short range from (-32,768 to 32,767)
        short s=10000;
        System.out.println("Short: " + s);


        // int range from (-2,147,483,648 to 2,147,483,647)
        int i=100000;
        System.out.println("Integer: " + i);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        // long range from (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long l=100000L;
        System.out.println("Long: " + l);
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);

        // More Primitive Data Types
        // float range from (3.4e−038 to 3.4e+038)
        float f = 5.75f;
        double x = 19.99;

        System.out.println("Float: " + f);

        // char range from ('\u0000' to '\uffff')
        char c = 'A';
        System.out.println("Char: " + c);

        // Trype Casting

        String number = "5000";

        int num = Integer.parseInt(number); // Converting String to int
        System.out.println("Converted Number: " + num);


    }
}
