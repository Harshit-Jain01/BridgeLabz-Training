package com.day1.vehiclerental;


public class Customer {

    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println("Customer: " + name);
        vehicle.displayInfo();
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: ₹" + vehicle.calculateRent(days));
        System.out.println("--------------------------------");
    }
}
