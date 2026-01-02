package com.encapsulation.library;

public class DVD extends LibraryItem implements Reservable {
	
	public DVD(String itemId, String title, String author) {
		super(itemId, title, author);	
	}

	@Override
	public void reserveItem() {
	if(checkAvailability()) {
		setAvailable(false);
		System.out.println("Reserved successfully");
		}
	else 
		System.out.println("Cannnnt reserve Book");
		
	}

	@Override
	public boolean checkAvailability() {
		if(isAvailable())
		return true;
		return false;
	}

	@Override
	public int getLoanDuration() {
		return 100;
	}
}
