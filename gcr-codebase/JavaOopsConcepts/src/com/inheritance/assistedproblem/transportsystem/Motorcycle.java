package com.inheritance.assistedproblem.transportsystem;

public class Motorcycle extends Vehicle {
	private int milege;
	public Motorcycle(int speed,String fuel,int milege) {
		super(speed,fuel);
		this.milege=milege;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Motorcycle has milege of "+milege);
	}
}
