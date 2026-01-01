package com.inheritance.assistedproblem.transportsystem;

public class Truck extends Vehicle {
	private int tyres;
	
	public Truck(int speed,String fuel,int tyres) {
		super(speed,fuel);
		this.tyres=tyres;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Truck has tyres "+tyres);
	}
}
