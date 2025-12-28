package com.constructor.level1;

public class Product {

    // Instance variables
   private String productName;
   private double price;
   private static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // display result
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

 
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 3000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}
