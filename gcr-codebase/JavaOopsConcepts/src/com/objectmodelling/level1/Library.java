package com.objectmodelling.level1;

import java.util.List;
import java.util.ArrayList;

public class Library {
	
	private List<Book>list=new ArrayList<>();;
	
	public void addBook(Book b) {
		list.add(b);
	}
	public void displayAllBook() {
		System.out.println("Title\t\t\tAuthor");
		for(int i=0;i<list.size();i++) {
			Book b=list.get(i);
			System.out.println(b.getTitle()+"--------"+b.getAuthor());
			
		}
	}
	
	

}
