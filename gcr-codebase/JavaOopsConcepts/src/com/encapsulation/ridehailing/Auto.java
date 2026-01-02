package com.encapsulation.ridehailing;


public class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // service charge
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
