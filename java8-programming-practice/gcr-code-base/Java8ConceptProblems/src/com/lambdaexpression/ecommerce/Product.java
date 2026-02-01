package com.lambdaexpression.ecommerce;

public class Product {
	private String name;
	private double price;
	private int rating;
	private double discount;
	
	//constructor
	public Product(String name,double price, int rating, double discount) {
		this.price = price;
		this.rating = rating;
		this.discount = discount;
		this.name=name;
	}
	
	public String toString() {
		return name+"  "+price+"  "+rating+"  "+discount;
	}

	public double getPrice() {
		return price;
	}

	

	public int getRating() {
		return rating;
	}


	public double getDiscount() {
		return discount;
	}

}
