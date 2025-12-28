package com.constructor.level1;

public class LibraryBookSystem{

	    String title;
	    String author;
	    double price;
	    boolean available;

	    // Constructor
	    LibraryBookSystem(String title,String author,double price){
	        this.title=title;
	        this.author=author;
	        this.price=price;
	        this.available=true;
	    }

	    // borrow a book
	    public void borrowBook(){
	        if(available){
	            available=false;
	            System.out.println("You have successfully borrowed:"+title);
	        }else{
	            System.out.println("Sorry,the book '"+title+"'already borrowed.");
	        }
	    }

	    // display book details
	    public void displayDetails(){
	        System.out.println("Title:"+title);
	        System.out.println("Author:"+author);
	        System.out.println("Price:₹"+price);
	        System.out.println("Available:"+(available?"Yes":"No"));
	    }
	
	    public static void main(String[] args){
	        LibraryBookSystem book1=new LibraryBookSystem("Fire And Ice","Robert Frost",523.50);

	        book1.displayDetails();
	        book1.borrowBook();
	        book1.borrowBook();
	        book1.displayDetails();
	    }
}

