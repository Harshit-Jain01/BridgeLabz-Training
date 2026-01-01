package com.inheritance.multilevel.ordermanagement;

import java.time.LocalDate;

public class UseOrder {
	public static void main(String[] args) {
		LocalDate orderdate=LocalDate.of(2026,1,1);
		LocalDate deliverydate=LocalDate.of(2026,1,10);
		
		Order o=new Order(12535,orderdate);
		o.getOrderStatus();
		System.out.println("---");
		ShippedOrder so=new ShippedOrder(12535,orderdate,436657);
		so.getOrderStatus();
		System.out.println("---");
		DeliveredOrder dod=new DeliveredOrder(12535,orderdate,436657,deliverydate);
		dod.getOrderStatus();
		
	}

}
