package com.inheritance.assistedproblem.transportsystem;

public class Car extends Vehicle {
	private int seatCapacity;

	public Car(int speed,String fuel,int seatCapacity) {
		super(speed,fuel);
		this.seatCapacity = seatCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Car has capacity of seats "+seatCapacity);
	}
	
	
	
	
}
