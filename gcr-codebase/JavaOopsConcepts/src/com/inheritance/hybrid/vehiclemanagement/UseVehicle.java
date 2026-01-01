package com.inheritance.hybrid.vehiclemanagement;

public class UseVehicle{

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220, 75);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println("------------------");
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 45);
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}
