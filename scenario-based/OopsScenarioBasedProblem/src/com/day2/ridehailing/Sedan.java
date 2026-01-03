package com.day2.ridehailing;


public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan", 80, 15);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}
