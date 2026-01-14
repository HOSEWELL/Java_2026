package com.github.hosewell.operators;

public class Main {

    public static void main(String[] args) {
        // Call different operator methods
        arithmeticOperators();
        assignmentOperators();
        comparisonOperators();
        logicalOperators();
        incrementDecrementOperators();
    
    }

    // Arithmetic Operators
    public static void arithmeticOperators() {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));        
        System.out.println("Subtraction: " + (a - b));      
        System.out.println("Multiplication: " + (a * b));   
        System.out.println("Division: " + (a / b));          
        System.out.println("Modulus/ remainder: " + (a % b));    
        
    }

    // Assignment Operators
    public static void assignmentOperators() {

        // Addition assignment operator
        int balance = 20000;

        // deposit 5000

        // balance = balance + 5000;
            balance += 5000;
        System.out.println("Current balance: " + balance);

        // Subtraction assignment operator
        // withdraw 8000 + charges 115

        // balance = balance - (8000 + 11500);
            balance -= (8000 + 115);
        System.out.println("Current balance after withdrawal: " + balance);


        // Charity work for 3 children

        // first see the remaider when balance is divided by 3

        System.out.println("Remainder when balance is divided by 3: " + (balance % 3));

        balance = balance / 3;
        System.out.println("charity money per each child: " + balance);

        // what is i want to give all my balance to charity
        double disbursement = (double) balance / 3;
        System.out.println("Total charity disbursement: " + disbursement);
    }

    // Comparison Operators
    public static void comparisonOperators() {

        int x = 10;
        int y = 20;
 
        System.err.println("Comparison Operators on :");
        System.out.println("x == y: " + (x == y));  
        System.out.println("x != y: " + (x != y));  
        System.out.println("x > y: " + (x > y));    
        System.out.println("x < y: " + (x < y));    
        System.out.println("x >= y: " + (x >= y));  
        System.out.println("x <= y: " + (x <= y));

        // string comparison
        String str1 = "Hello";
        String str2 = "hello";  
        System.out.println("str1.equals(str2): " + str1.equals(str2));

    }


    // Logical Operators used for boolean values
    public static void logicalOperators() {

        int balance = 10000;
        int charges = 115;
        int withdrawAmount = 5000;

        // condition withdrawAmount + charges <= balance
        // correct pin = true

        boolean isAbleToWithdraw = (withdrawAmount + charges <= balance);
        boolean isCorrectPin = true;

        System.out.println("You can withdraw: " + (isAbleToWithdraw && isCorrectPin)); 

        //  A and B
        // T and T -> T
        // T and F -> F
        // F and F -> F

        // Using OR (||) operator
        // can only be false when both conditions are false

        System.out.println("You can withdraw: " + (isAbleToWithdraw || isCorrectPin));

        // using NOT operator
        System.out.println("isAbleToWithdraw: " + isAbleToWithdraw);
        System.out.println("Not isAbleToWithdraw: " + !isAbleToWithdraw);
    }

    // Increment and Decrement Operators

    public static void incrementDecrementOperators() {
        int a = 5;

        // Increment operator
        System.out.println("Original a: " + a);
        System.out.println("Post-increment a: " + (a++)); 
        System.out.println("After Post-increment a: " + a); 

        a = 5; 
        System.out.println("Pre-increment a: " + (++a)); 
        System.out.println("After Pre-increment a: " + a); 

        // Decrement operator
        a = 5; 
        System.out.println("Post-decrement a: " + (a--)); 
        System.out.println("After Post-decrement a: " + a); 

        a = 5; 
        System.out.println("Pre-decrement a: " + (--a)); 
        System.out.println("After Pre-decrement a: " + a); 
    }
}