package com.objectmodelling.level1;

public class UseLibrary {
	
	public static void main(String[] args) {
		
		Library lib=new Library();
		lib.addBook(new Book("Geetanjali","RavindraNath TAgore"));
		lib.addBook(new Book("Fire And Ice","Robert Frost"));
		lib.addBook(new Book("The Story of my Life","Hellen Keller"));
		lib.addBook(new Book("The diary of young girl","Anne frank"));
		lib.addBook(new Book("A tale of two cities","Charles Dickens"));
		
		lib.displayAllBook();
		
	}

}
