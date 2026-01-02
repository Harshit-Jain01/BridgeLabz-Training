package com.day1.vehiclerental;


public class Car extends Vehicle {

    private double luxuryCharge = 500;

    public Car(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rate per day: ₹" + baseRate);
        System.out.println("Luxury Charge: ₹" + luxuryCharge);
    }
}
