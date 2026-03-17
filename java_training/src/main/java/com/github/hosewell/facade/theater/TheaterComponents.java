package com.github.hosewell.facade.theater;

class SmartLights {
    public void dim(int level) { System.out.println("Lights: Dimming to " + level + "%"); }
    public void on() { System.out.println("Lights: Turning back on full brightness."); }
}

class SoundSystem {
    public void on() { System.out.println("Sound: Powering on Surround Sound..."); }
    public void setVolume(int level) { System.out.println("Sound: Volume set to " + level); }
}

class StreamingService {
    public void searchMovie(String title) { System.out.println("Streaming: Loading " + title + "..."); }
    public void play() { System.out.println("Streaming: Movie Started!"); }
}