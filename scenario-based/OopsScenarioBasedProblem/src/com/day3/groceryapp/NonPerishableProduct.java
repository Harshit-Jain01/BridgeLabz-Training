package com.day3.groceryapp;

class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, "Non-Perishable", quantity);
    }

    @Override
    double getDiscount() {
    	// 5% discount
        return getTotalPrice() * 0.05; 
    }
}
