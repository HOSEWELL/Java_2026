package com.github.hosewell.adapter;

public class Main {
    public static void main(String[] args) {
        // 1. We have the old system
        OldSchoolBankSystem legacyBank = new OldSchoolBankSystem();

        // 2. We wrap it in our Adapter so it looks like a PaymentProcessor
        PaymentProcessor processor = new BankAdapter(legacyBank);

        // 3. Our code now uses the clean 'pay' method
        processor.pay(5000.00);
    }
}