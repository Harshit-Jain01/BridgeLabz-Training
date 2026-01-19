package com.day6.artexpo;

public class Artist {
    public String name;
    public int registrationTime; 

    public Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " (Registered at: " + registrationTime + ")";
    }
}
