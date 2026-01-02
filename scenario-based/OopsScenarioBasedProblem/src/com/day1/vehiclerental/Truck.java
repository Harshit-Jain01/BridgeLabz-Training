package com.day1.vehiclerental;

public class Truck extends Vehicle {

    private double loadChargePerDay = 800;

    public Truck(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (loadChargePerDay * days);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rate per day: ₹" + baseRate);
        System.out.println("Load Charge per day: ₹" + loadChargePerDay);
    }
}
