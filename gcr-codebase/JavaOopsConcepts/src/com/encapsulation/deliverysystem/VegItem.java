package com.encapsulation.deliverysystem;


public class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.90; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}
