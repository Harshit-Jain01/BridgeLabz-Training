package com.day5.parkingmanagement;

public class UseParkingSystem {
	 public static void main(String[] args) {

	        ParkingSlot slot1 = new ParkingSlot("S1", "Ground Floor", "Car");

	        Vehicle car = new Car("MH12AB1234");

	        ParkingManager manager = new ParkingManager();

	        manager.parkVehicle(slot1, car);
	        manager.exitVehicle(slot1, car, 7);

	        manager.showLogs();
	    }
}
