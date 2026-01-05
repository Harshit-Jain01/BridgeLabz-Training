package com.day3.groceryapp;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckOut {

    private List<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Cart with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice() - p.getDiscount();
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        totalPrice = totalPrice - couponAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(
                p.name + " | Qty: " + p.quantity +
                " | Price: " + p.getTotalPrice() +
                " | Discount: " + p.getDiscount()
            );
        }
        System.out.println("Final Payable Amount: ₹" + totalPrice);
    }
}

