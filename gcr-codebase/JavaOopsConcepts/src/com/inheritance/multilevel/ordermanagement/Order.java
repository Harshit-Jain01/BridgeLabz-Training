package com.inheritance.multilevel.ordermanagement;

import java.time.LocalDate;

public class Order {

	private int orderId;
	private LocalDate orderDate;
	
	public Order(int orderId, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public void getOrderStatus() {
		System.out.println("Order Id "+orderId);
		System.out.println("Order Date is "+orderDate);
		
	}
}
