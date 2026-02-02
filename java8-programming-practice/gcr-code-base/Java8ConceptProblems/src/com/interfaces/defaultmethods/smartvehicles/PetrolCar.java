package com.interfaces.defaultmethods.smartvehicles;

public class PetrolCar implements Vehicle {

    private String model;
    private int currentSpeed;

    // constructor
    public PetrolCar(String model, int currentSpeed) {
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void displaySpeed() {
        System.out.println(model + " (Petrol) → Current speed: " + currentSpeed + " km/h");
    }

}