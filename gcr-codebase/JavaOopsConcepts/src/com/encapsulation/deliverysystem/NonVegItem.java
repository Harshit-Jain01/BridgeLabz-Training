package com.encapsulation.deliverysystem;


public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.95; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg Items";
    }
}
