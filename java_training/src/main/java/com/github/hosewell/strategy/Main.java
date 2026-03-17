package com.github.hosewell.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // User chooses M-Pesa
        cart.setPaymentMethod(new MpesaStrategy("0712345678"));
        cart.checkout(2500.0);

        System.out.println("--- Swapping Payment Method ---");

        // User changes mind and uses Visa
        cart.setPaymentMethod(new VisaStrategy("4111-2222-3333-4444"));
        cart.checkout(2500.0);
    }
}