package com.encapsulation.vehiclerental;

public abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	private int days;
	
	
	public double getRentalRate() {
		return rentalRate;
	}


	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public Vehicle(String vehicleNumber, String type, double rentalRate, int days) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.days = days;
	}
	
	public void display() {
		System.out.println("Vehicle type is "+type);
		System.out.println("Vehicle number is "+vehicleNumber);
		
		
	}
	
	abstract double calculateRentalCost(int days);
	
}
