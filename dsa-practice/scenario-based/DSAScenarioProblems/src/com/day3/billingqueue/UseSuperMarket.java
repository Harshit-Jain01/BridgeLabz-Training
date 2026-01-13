package com.day3.billingqueue;

public class UseSuperMarket{

    public static void main(String[] args) {
        Item.addItem("Biscuit", 50, 20);
        Item.addItem("Maggi", 40, 14);
        Item.addItem("Oil", 30, 300);

        CheckoutCounter counter = new CheckoutCounter();

        Customer c1 = new Customer();
        c1.addItem("Biscuit", 5);
        c1.addItem("Oil", 2);

        Customer c2 = new Customer();
        c2.addItem("Maggi", 4);
        c2.addItem("Biscuit", 3);

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        counter.processCustomer();

    }
}
