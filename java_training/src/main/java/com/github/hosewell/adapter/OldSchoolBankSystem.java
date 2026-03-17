package com.github.hosewell.adapter;

public class OldSchoolBankSystem {
    // The old system uses a weird method name and requires a 'Reference ID'
    public void executeTransaction(String refId, double value) {
        System.out.println("Transaction " + refId + " processed for: KES " + value);
    }
}