package com.day5.bookstore;

public class UseBookstore {

	  public static void main(String[] args) {

	        Book b1 = new PrintedBook("Clean Code", "Robert Martin", 500, 10);
	        Book b2 = new EBook("Effective Java", "Joshua Bloch", 400, 20);

	        Order order = new Order("Amit");

	        order.addBook(b1, 2);
	        order.addBook(b2, 1);

	        System.out.println("Total Amount: " + order.calculateTotal());
	        System.out.println("Order Status: " + order.getStatus());
	    }
	}
