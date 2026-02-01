package com.lambdaexpression.ecommerce;

import java.util.*;

public class UseOnlineShop {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Cooler", 4000, 9, 40));
        list.add(new Product("Fan", 900, 4, 20));
        list.add(new Product("AC", 12000, 8, 10));
        list.add(new Product("Speaker", 1600, 5, 20));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sorting campaign (PRICE / RATING / DISCOUNT): ");
        String campaign = sc.nextLine().toUpperCase();

        Comparator<Product> comparator;

        switch (campaign) {
            case "PRICE":
                comparator = (a, b) -> Double.compare(b.getPrice(), a.getPrice());
                break;

            case "RATING":
                comparator = (a, b) -> Integer.compare(b.getRating(), a.getRating());
                break;

            case "DISCOUNT":
                comparator = (a, b) -> Double.compare(b.getDiscount(), a.getDiscount());
                break;

            default:
                System.out.println("Invalid campaign!");
                return;
        }

        Collections.sort(list, comparator);
        System.out.println("Sorted Products:");
        System.out.println("Name Price Rating Discount");
        list.forEach(System.out::println);
    }
}
