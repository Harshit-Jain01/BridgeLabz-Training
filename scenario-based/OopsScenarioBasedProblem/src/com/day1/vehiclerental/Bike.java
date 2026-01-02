package com.day1.vehiclerental;

public class Bike extends Vehicle {

    public Bike(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // no surcharge
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rate per day: ₹" + baseRate);
    }
}
