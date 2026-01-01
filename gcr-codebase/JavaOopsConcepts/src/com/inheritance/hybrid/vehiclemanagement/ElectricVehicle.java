package com.inheritance.hybrid.vehiclemanagement;

public class ElectricVehicle extends Vehicle {

    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
