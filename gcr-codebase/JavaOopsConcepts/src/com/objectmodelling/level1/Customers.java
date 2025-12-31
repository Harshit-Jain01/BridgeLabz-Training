package com.objectmodelling.level1;

public class Customers {
	
	private String customerName;

    // Constructor 
    public Customers(String customerName) {
        this.customerName = customerName;
    }

    // place an order method
    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName + " placed an order.");
        order.displayOrder();
    }
}
