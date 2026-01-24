package com.github.hosewell.assignment.javase010.bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}