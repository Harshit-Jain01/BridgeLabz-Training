package com.encapsulation.ridehailing;


public class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // cheapest
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }
}
