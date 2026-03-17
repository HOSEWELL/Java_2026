package com.github.hosewell.adapter;

public class BankAdapter implements PaymentProcessor {
    private OldSchoolBankSystem oldSystem;

    public BankAdapter(OldSchoolBankSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void pay(double amount) {
        // The Adapter "translates" the call. 
        // It generates the Ref ID that the old system needs.
        String generatedRefId = "REF-" + System.currentTimeMillis();
        oldSystem.executeTransaction(generatedRefId, amount);
    }
}