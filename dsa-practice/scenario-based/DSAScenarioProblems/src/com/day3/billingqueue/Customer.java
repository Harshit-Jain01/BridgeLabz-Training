package com.day3.billingqueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Customer{

    private static int tempId = 100;
    private int customerId;
    private Map<String, Integer> cart = new HashMap<>();

    public Customer() {
        customerId = tempId++;
        System.out.println("Customer " + customerId + " entered the checkout");
    }

    public int getCustomerId() {
        return customerId;
    }

    public void addItem(String name, int qty) {
        cart.put(name, qty);
    }

    public double calculateBill() {
        double total = 0;

        for (String item : cart.keySet()) {
            int qty = cart.get(item);

            if (Item.getStock(item) >= qty) {
                total += Item.getPrice(item) * qty;
                Item.updateStock(item, qty);
            } else {
                System.out.println("Insufficient stock for " + item);
            }
        }
        return total;
    }
}