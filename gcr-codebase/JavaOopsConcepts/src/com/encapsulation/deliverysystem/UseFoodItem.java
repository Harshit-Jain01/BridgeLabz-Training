package com.encapsulation.deliverysystem;

public class UseFoodItem {

	    public static void main(String[] args) {

	        FoodItem item1 = new VegItem("Paneer Burger", 120, 2);
	        FoodItem item2 = new NonVegItem("Chicken Pizza", 250, 1);

	        processOrder(item1);
	        System.out.println("----------------------");
	        processOrder(item2);
	    }

	    // Polymorphism
	    public static void processOrder(FoodItem item) {

	        item.getItemDetails();

	        double total = item.calculateTotalPrice();
	        System.out.println("Total Price: ₹" + total);

	        if (item instanceof Discountable) {
	            Discountable d = (Discountable) item;
	            double discountedPrice = d.applyDiscount(total);
	            System.out.println(d.getDiscountDetails());
	            System.out.println("Final Price after Discount: ₹" + discountedPrice);
	        }
	    }
	}


