package com.day6.travelplanner;

public class Hotel {

    private double costPerNight;

    public Hotel(double costPerNight) {
        this.costPerNight = costPerNight;
    }

    double getCost(int nights) {
        return costPerNight * nights;
    }
}
