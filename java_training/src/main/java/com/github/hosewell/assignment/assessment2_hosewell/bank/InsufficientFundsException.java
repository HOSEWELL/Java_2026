package com.github.hosewell.assignment.assessment2_hosewell.bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}