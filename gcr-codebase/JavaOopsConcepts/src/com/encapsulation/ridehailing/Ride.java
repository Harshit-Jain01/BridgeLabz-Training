package com.encapsulation.ridehailing;

public class Ride {


	    public static void main(String[] args) {

	        Vehicle v1 = new Car("C101", "Rahul", 15);
	        Vehicle v2 = new Bike("B202", "Aman", 8);
	        Vehicle v3 = new Auto("A303", "Suresh", 10);

	        calculateRideFare(v1, 10);
	        System.out.println("-------------------");
	        calculateRideFare(v2, 10);
	        System.out.println("-------------------");
	        calculateRideFare(v3, 10);
	    }

	    // Polymorphic method
	    public static void calculateRideFare(Vehicle vehicle, double distance) {

	        vehicle.getVehicleDetails();
	        System.out.println("Distance: " + distance + " km");
	        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
	    }
	}


