package com.constructor.level1;

public class UseBookLibrary {
	 public static void main(String[] args) {

	        EBook ebook = new EBook( "978-0134685991","Effective Java","Joshua Bloch",5.2);
	        ebook.displayDetails();

	        // modify author using setter
	        ebook.setAuthor("J. Bloch");
	        System.out.println("Updated Author: " + ebook.getAuthor());
	    }
	}
	








