package com.encapsulation.library;

public class Book extends LibraryItem implements Reservable{
	
	
	public Book(String itemId, String title, String author) {
		super(itemId, title, author);		
	}

	@Override
	public void reserveItem() {
		if(checkAvailability()) {
			setAvailable(false);
			System.out.println("Reserved successfully");
			}
		System.out.println("Cannnnt reserve Book");
		
	}

	@Override
	public boolean checkAvailability() {
		if(isAvailable())
		return true;
		return false;
	}

	@Override
	int getLoanDuration() {
		return 80;
	}

}
