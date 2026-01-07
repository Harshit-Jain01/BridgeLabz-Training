package com.day5.bookstore;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double basePrice) {
        return basePrice * 0.90;
    }
}
