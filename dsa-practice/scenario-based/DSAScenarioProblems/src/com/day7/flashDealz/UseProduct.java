package com.day7.flashDealz;


import java.util.ArrayList;
import java.util.List;


public class UseProduct {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 45));
        products.add(new Product("Mobile", 60));
        products.add(new Product("Headphones", 30));
        products.add(new Product("Smart Watch", 50));
        products.add(new Product("Camera", 40));
        products.add(new Product("Shoes", 70));

        // Quick Sort by discount (descending)
        QuickSortProducts.quickSort(products, 0, products.size() - 1);

        System.out.println("Products sorted by highest discount:");

        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "%");
        }
    }
}
