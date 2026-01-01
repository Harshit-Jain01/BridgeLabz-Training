package com.inheritance.multilevel.ordermanagement;

import java.time.LocalDate;

public class DeliveredOrder extends ShippedOrder {
	
	private LocalDate deliveryDate;

	public DeliveredOrder(int orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("your delivery date is "+deliveryDate);
	}
	
	
}
