package com.encapsulation.vehiclerental;

public class Truck extends Vehicle implements Insurable {
	private String insuranceNumber;
	
	public Truck(String vehicleNumber, String type, double rentalRate, int days, String insuranceNumber) {
	super(vehicleNumber, type, rentalRate, days);
	this.insuranceNumber = insuranceNumber;
    }

	@Override
	public double calculateInsurance() {
		
		return 2500*getDays();
	}

	@Override
	public String getInsuranceDetails() {
		System.out.println();
		return insuranceNumber;
	}

	@Override
	double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}
}
