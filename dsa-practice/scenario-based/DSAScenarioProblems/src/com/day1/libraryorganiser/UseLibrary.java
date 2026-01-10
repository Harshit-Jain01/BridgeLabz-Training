package com.day1.libraryorganiser;

import java.util.LinkedList;
import java.util.List;

public class UseLibrary {
	 
	public static void main(String []args) {
		// TODO Auto-generated method stub
		BookShelf shelf=new BookShelf();
		
		List<Book>fiction=new LinkedList<>();
		fiction.add(new Book("The Great Gatsby","F. Scott Fitzgerald",10));
		fiction.add(new Book("To Kill a Mockingbird","Harper Lee",13));
		shelf.addGenre("Fiction", fiction);
		
		List<Book> mystery = new LinkedList<>();
		mystery.add(new Book("Gone Girl", "Gillian Flynn", 2));
		mystery.add(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 14));
		shelf.addGenre("Mystery", mystery);

		List<Book> scienceFiction = new LinkedList<>();
		scienceFiction.add(new Book("Dune", "Frank Herbert", 3));
		scienceFiction.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 11));
		shelf.addGenre("Science Fiction", scienceFiction);

		List<Book> fantasy = new LinkedList<>();
		fantasy.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 9));
		fantasy.add(new Book("The Hobbit", "J.R.R. Tolkien", 2));
		shelf.addGenre("Fantasy", fantasy);
		
		shelf.borrow("Fantasy","The Hobbit");
		shelf.borrow("Fantasy","The Hobbit");
		shelf.borrow("Fantasy","The Hobbit");
		shelf.borrow("Fantasy","Atomic Hobbit");
		
		shelf.returnBook("Fantasy","The Hobbit");
		
		
		
		
		

	}
}
