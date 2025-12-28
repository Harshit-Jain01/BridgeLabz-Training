package com.constructor.level1;

public class Book {
	private String title;
	private String author;
	private double price;
	
	//Non-parametrised constructor
	public Book() {
        title="NA";
        author="NA";
        price=0.0;
    }
	
	// Parameterized constructor
    public Book(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
    // Method to display book details
    public void displayDetails() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:₹" + price);

    }


	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Geetanjali","RabindraNath Tagore",230);
		  book1.displayDetails();
		  System.out.println();
		  book2.displayDetails();
}}
