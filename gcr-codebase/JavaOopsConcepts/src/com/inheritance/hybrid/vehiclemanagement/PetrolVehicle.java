package com.inheritance.hybrid.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable {

    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
