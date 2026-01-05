package com.day3.groceryapp;

class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }

    @Override
    double getDiscount() {
    	 // 10% discount
        return getTotalPrice() * 0.10;
    }
}
