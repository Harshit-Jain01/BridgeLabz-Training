package com.day7.restaurantordersystem;

public class FoodItem {
		private String name;
		private String category;
		private double price;
		private boolean availability;
		public FoodItem(String name, String category, double price, boolean availability) {
			super();
			this.name = name;
			this.category = category;
			this.price = price;
			this.availability = availability;
		}
		public boolean isAvailability() {
			return availability;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
}
