package com.objectmodelling.level1;

public class Product {

    private String productName;
    private double price;

    // Constructor 
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // display product details
    public void displayProduct() {
        System.out.println("Product : " + productName);
        System.out.println("Price   : " + price);
    }

    // get price of Order
    public double getPrice() {
        return price;
    }
}