package com.github.hosewell.facade.theater;

public class HomeTheaterFacade {
    private SmartLights lights = new SmartLights();
    private SoundSystem sound = new SoundSystem();
    private StreamingService netflix = new StreamingService();

    // The "One-Click" Method
    public void watchMovie(String movieTitle) {
        System.out.println("--- Preparing for Movie Night ---");
        lights.dim(10);
        sound.on();
        sound.setVolume(25);
        netflix.searchMovie(movieTitle);
        netflix.play();
        System.out.println("--- Enjoy your movie! ---");
    }

    public void stopMovie() {
        System.out.println("--- Shutting down theater ---");
        lights.on();
        System.out.println("--- Theater is off ---");
    }
}