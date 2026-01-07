package com.day5.bookstore;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private String status = "CREATED";

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double basePrice = book.getPrice() * qty;
            total += book.applyDiscount(basePrice);
        }
        return total;
    }

    protected void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
