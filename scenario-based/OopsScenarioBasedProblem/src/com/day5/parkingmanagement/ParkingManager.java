package com.day5.parkingmanagement;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingRecords = new ArrayList<>();

    public void parkVehicle(ParkingSlot slot, Vehicle vehicle) {
        if (slot.isAvailable()) {
            slot.assignSlot();
            bookingRecords.add("Vehicle " + vehicle.getVehicleNumber() +
                    " parked at slot " + slot.getSlotId());
        }
    }

    public void exitVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {
        slot.releaseSlot();
        double charges = vehicle.calculateCharges(hours);
        bookingRecords.add("Vehicle " + vehicle.getVehicleNumber() +
                " exited. Charges: " + charges);
    }

    public void showLogs() {
        for (String record : bookingRecords) {
            System.out.println(record);
        }
    }
}
