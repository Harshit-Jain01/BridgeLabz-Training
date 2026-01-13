package com.day3.billingqueue;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private static Map<String, Double> priceMap = new HashMap<>();
    private static Map<String, Integer> stockMap = new HashMap<>();

    public static void addItem(String name, int quantity, double price) {
        priceMap.put(name, price);
        stockMap.put(name, quantity);
    }

    public static int getQuantity(String name) {
        return stockMap.getOrDefault(name, 0);
    }
    
    public static int getStock(String name) {
        return stockMap.getOrDefault(name, 0);
    }


    public static double getPrice(String name) {
        return priceMap.getOrDefault(name, 0.0);
    }

    public static void updateStock(String name, int qty) {
        stockMap.put(name, stockMap.get(name) - qty);
    }
}
