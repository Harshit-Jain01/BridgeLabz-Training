package com.day2.ridehailing;

public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV", 120, 20);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}
