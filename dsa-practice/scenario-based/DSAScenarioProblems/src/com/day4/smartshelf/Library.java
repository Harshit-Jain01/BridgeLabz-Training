package com.day4.smartshelf;

public class Library {
	public static void main(String[] args) {
		
		User user1=new User("Bhanu");
		user1.addBook("Fire And Ice");
		user1.addBook("The warrior");
		user1.addBook("Hustler");
		
		user1.display();
		
		User user2=new User("Jyoti");
		user2.addBook("Harry Potter");
		user2.addBook("Rich dad poor dad");
		user2.addBook("Hustler");
		
		user2.display();
		
		
		
	}
}
