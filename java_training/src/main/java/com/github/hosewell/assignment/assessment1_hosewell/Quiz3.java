package com.github.hosewell.assignment.assessment1_hosewell;

public class Quiz3 {
    public static void main(String[] args) {
        
        System.out.println("Number Sequence (1 to 20)");

        for (int i = 1; i <= 20; i++) {
            
            System.out.print(i + " - ");

            if (i % 2 == 0) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }

            if (i % 5 == 0) {
                System.out.print(", Multiple of 5");
            }

            System.out.println();
        }
    }
}
