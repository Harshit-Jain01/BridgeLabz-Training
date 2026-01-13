package com.day3.billingqueue;


import java.util.LinkedList;
import java.util.Queue;

public class CheckoutCounter {

    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer c) {
        queue.add(c);
        System.out.println("Customer " + c.getCustomerId() + " added to queue");
    }

    public void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        double bill = c.calculateBill();
        System.out.println("Customer " + c.getCustomerId() + " bill amount: " + bill);
        System.out.println("Customer " + c.getCustomerId() + " exited checkout");
    }
}
