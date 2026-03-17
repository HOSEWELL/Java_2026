package com.github.hosewell.facade.theater;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // One command triggers 5 actions behind the scenes
        homeTheater.watchMovie("Inception");
    }
}