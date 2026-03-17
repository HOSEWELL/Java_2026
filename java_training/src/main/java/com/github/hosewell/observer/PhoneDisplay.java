package com.github.hosewell.observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Phone Notification: " + news);
    }
}