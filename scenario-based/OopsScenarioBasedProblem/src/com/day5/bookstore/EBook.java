package com.day5.bookstore;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public double applyDiscount(double basePrice) {
        return basePrice * 0.80;
    }
}
