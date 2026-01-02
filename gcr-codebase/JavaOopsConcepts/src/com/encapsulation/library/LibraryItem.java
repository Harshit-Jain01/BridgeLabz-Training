package com.encapsulation.library;

import java.util.HashSet;
import java.util.Set;

public abstract class LibraryItem {
	private String itemId;
	private String title;
	private String author;
	private boolean available=true;
	abstract int getLoanDuration();
	
	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean f) {
		available=f;
	}
	public String getItemId() {
		return itemId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void getItemDetails() {
		System.out.println("Item id is "+itemId);
		System.out.println("Title is "+title);
		System.out.println("Author is "+author);
	}
	
}
