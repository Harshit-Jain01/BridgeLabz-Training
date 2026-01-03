package com.day2.ridehailing;

public class RideService implements IRideService {

    private double fare;      // sensitive
    private boolean active;   // ride state

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        fare = vehicle.calculateFare(distance);
        active = true;

        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Fare: " + fare);
    }

    @Override
    public void endRide() {
        active = false;
        System.out.println("Final Fare: " + fare);
    }
}
