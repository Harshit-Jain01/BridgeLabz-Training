package com.day7.restaurantordersystem;

public interface IOrderable {
	void placeOrder(FoodItem item);
	void cancelOrder(FoodItem item);
}
