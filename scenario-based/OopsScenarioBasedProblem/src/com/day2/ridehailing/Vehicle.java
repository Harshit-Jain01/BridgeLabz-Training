package com.day2.ridehailing;


public abstract class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;

    protected double baseFare;
    protected double ratePerKm;

    protected Vehicle(String vehicleNumber, int capacity, String type,
                      double baseFare, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getType() {
        return type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
