package com.github.hosewell.observer;

public class EmailDisplay implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Email Sent: Breaking News -> " + news);
    }
}