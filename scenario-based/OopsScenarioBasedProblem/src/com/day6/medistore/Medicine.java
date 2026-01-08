package com.day6.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;          
    private int quantity;          
    protected LocalDate expiryDate;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); 
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }
    

    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected void reduceStock(int qty) {
        if (qty > quantity)
            throw new IllegalArgumentException("Insufficient stock");
        quantity -= qty;
    }

    private double calculateTotal(int qty) {
        double total=price*qty;
        if (qty >= 5) {
            total -= total * 0.10;   
        }
        return total;
    }

    @Override
    public double sell(int qty) {
        reduceStock(qty);
        return calculateTotal(qty);
    }

    @Override
    public abstract boolean checkExpiry();
}
