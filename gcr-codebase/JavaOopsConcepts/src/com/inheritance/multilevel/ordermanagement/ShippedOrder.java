package com.inheritance.multilevel.ordermanagement;

import java.time.LocalDate;

public class ShippedOrder extends Order {
	
	private int trackingNumber;

	public ShippedOrder(int orderId, LocalDate orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("your tracking number is "+trackingNumber);
	}
	
	

}
