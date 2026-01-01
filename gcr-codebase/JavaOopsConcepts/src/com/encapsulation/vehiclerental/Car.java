package com.encapsulation.vehiclerental;

public class Car extends Vehicle implements Insurable{
  
	private String insuranceNumber;
	
	public Car(String vehicleNumber, String type, double rentalRate, int days, String insuranceNumber) {
	super(vehicleNumber, type, rentalRate, days);
	this.insuranceNumber = insuranceNumber;
    }

	@Override
	public double calculateInsurance() {
		
		return 1800*getDays();
	}

	@Override
	public String getInsuranceDetails() {
		return "Car insurance no. "+insuranceNumber;
	}

	@Override
	double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}
}
