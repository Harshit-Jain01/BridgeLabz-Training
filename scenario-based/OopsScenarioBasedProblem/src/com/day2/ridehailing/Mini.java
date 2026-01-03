package com.day2.ridehailing;

public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini", 50, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}
