package com.day7.restaurantordersystem;

public class UseOrder {
	public static void main(String[] args) {
		FoodItem food1=new VegItem("Noodles","Chinese",190,true);
		FoodItem food2=new NonVegItem("Biryani","Rice",400,false);
		FoodItem food3=new VegItem("Dosa","South-Indian",120,true);
		FoodItem food4=new VegItem("Special Thali","North-Indian",500,true);
		
		Order order1=new Order();
		order1.placeOrder(food3);
		order1.placeOrder(food1);
		order1.placeOrder(food2);
		System.out.println("First Order");
		order1.displayBill();
		
		Order order2=new Order();
		order2.placeOrder(food4);
		order2.placeOrder(food1);
		order2.cancelOrder(food1);
		System.out.println("Second Order");
		order2.displayBill();
		
	}
}
