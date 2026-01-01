package com.encapsulation.vehiclerental;

public class Bike extends Vehicle implements Insurable {
	
	private String insuranceNumber;
	
	
	public Bike(String vehicleNumber, String type, double rentalRate, int days, String insuranceNumber) {
		super(vehicleNumber, type, rentalRate, days);
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public double calculateInsurance() {
		
		return 1200*getDays();
	}

	@Override
	public String getInsuranceDetails() {
		return insuranceNumber;
	}

	@Override
	double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}

}
