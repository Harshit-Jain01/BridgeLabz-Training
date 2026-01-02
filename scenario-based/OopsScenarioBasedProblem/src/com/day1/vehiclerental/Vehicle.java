package com.day1.vehiclerental;


public abstract class Vehicle implements Rentable {

    protected String vehicleId;
    protected String brand;
    protected double baseRate;   // per day

    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public abstract void displayInfo();
}

