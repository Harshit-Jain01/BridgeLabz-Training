package com.constructor.level1;

public class CarRentalSystem{

	//attributes
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double totalCost;

	// Parameterized constructor
	public CarRentalSystem(String customerName,String carModel,int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
		calculateCost();
	}

	// calculate total cost
	private void calculateCost(){
		double rate;
		switch(carModel.toLowerCase()){
			case "sedan":
				rate=1500;
				break;
			case "suv":
				rate=2500;
				break;
			case "hatchback":
				rate=1000;
				break;
			default:
				rate=1200;
		}
		totalCost=rate*rentalDays;
	}

	// display rental details
	public void displayRental(){
		System.out.println("Customer Name:"+customerName);
		System.out.println("Car Model:"+carModel);
		System.out.println("Rental Days:"+rentalDays);
		System.out.println("Total Cost:"+totalCost);	
	}

	// Main method
	public static void main(String[] args){

		CarRentalSystem rent1=new CarRentalSystem("Seema","SUV",3);

		rent1.displayRental();
		
	
	}
}
