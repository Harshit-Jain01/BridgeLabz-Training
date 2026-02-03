package com.day1.lambdaexpression.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class UseProductLambda {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Mobile", 15000));
        products.add(new Product("Headphones", 1200));
        products.add(new Product("Mouse", 600));
        products.add(new Product("Notebook", 300));

        // 1. apply 10% discount
        System.out.println("Price after 10% discount:");
        products.forEach(p ->
                System.out.println(p.name + " : " + (p.price - (p.price * 0.10)))
        );

        // 2. sort products by price
        System.out.println("\nProducts sorted by price:");
        products.stream()
                .sorted((a, b) -> (int)(a.price - b.price))
                .forEach(p -> System.out.println(p.name + " " + p.price));

        // 3. free delivery eligibility (price > 500)
        System.out.println("\nFree delivery eligibility:");
        products.forEach(p ->
                System.out.println(
                        p.name + " : " + (p.price > 500 ? "Free Delivery" : "No Free Delivery")
                )
        );

        // 4. final bill amount (sum of prices)
        System.out.println("\nFinal bill amount:");
        double total =
                products.stream()
                        .map(p -> p.price)
                        .reduce(0.0, (a, b) -> a + b);
        System.out.println(total);

        // 5. print product names
        System.out.println("\nProduct names:");
        products.forEach(p -> System.out.println(p.name));
    }
}
