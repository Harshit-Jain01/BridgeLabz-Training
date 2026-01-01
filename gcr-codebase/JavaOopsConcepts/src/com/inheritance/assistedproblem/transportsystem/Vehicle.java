package com.inheritance.assistedproblem.transportsystem;

public class Vehicle {
	
	private int maxSpeed;
	private String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}

	public void displayInfo() {
		System.out.println("Speed is "+maxSpeed);
		System.out.println("Fuel type is"+fuelType);
	}
}
