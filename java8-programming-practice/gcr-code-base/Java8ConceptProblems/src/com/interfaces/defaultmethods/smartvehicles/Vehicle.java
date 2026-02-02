package com.interfaces.defaultmethods.smartvehicles;

public interface Vehicle {

    // original method - all vehicles must implement
    void displaySpeed();

    // default method added later for electric vehicles
    default void displayBatteryPercentage() {
        System.out.println("Battery status: Not applicable (non-electric vehicle)");
    }
}