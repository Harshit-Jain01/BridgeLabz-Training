package com.day7.restaurantordersystem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {
	
	private List<FoodItem> list=new ArrayList<>();
	private double total;
	@Override
	public void placeOrder(FoodItem item) {	
		if(item.isAvailability()) {
		list.add(item);
		System.out.println("Order placed successfully");
		total+=item.getPrice();
		}
		else
		System.out.println("Item not available");
		
	}
	@Override
	public void cancelOrder(FoodItem item) {
		if(list.contains(item)) {
			list.remove(item);
			System.out.println("cancelled item successfully");
			total-=item.getPrice();
		}
	
	}
	public void displayBill() {
		if(total>300)
			total-=applyDiscount(total);
		System.out.println("Your total bill is "+total);
	}
	
	public double applyDiscount(double price) {
		return 0.1*price;
	}
	
}
