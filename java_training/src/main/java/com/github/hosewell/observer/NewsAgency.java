package com.github.hosewell.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer s) {
        subscribers.add(s);
    }

    public void unsubscribe(Observer s) {
        subscribers.remove(s);
    }

    // This is the "Magic" method that notifies everyone
    public void notifySubscribers(String news) {
        for (Observer s : subscribers) {
            s.update(news);
        }
    }
}