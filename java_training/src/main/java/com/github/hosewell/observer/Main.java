package com.github.hosewell.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency bbc = new NewsAgency();

        PhoneDisplay myPhone = new PhoneDisplay();
        EmailDisplay myEmail = new EmailDisplay();

        // Registering observers
        bbc.subscribe(myPhone);
        bbc.subscribe(myEmail);

        // When news happens, everyone gets it at once
        bbc.notifySubscribers("Java 21 is now the standard at Systech!");

        System.out.println("--- Unsubscribing Email ---");
        bbc.unsubscribe(myEmail);

        bbc.notifySubscribers("The weekend is finally here!");
    }
}