package com.day4.smartshelf;

import java.util.ArrayList;
import java.util.List;

public class User {
	 
	private String name;
	private static List<String>booklist;
	
	public User(String name) {
		this.name = name;
		booklist =new ArrayList<>();
	}
	
	public void addBook(String bookname) {
		
		booklist.add(bookname);
		
		for(int i=booklist.size()-1;i>0;i--) {
			String b1=booklist.get(i);
			String b2=booklist.get(i-1);
			if(b1.compareToIgnoreCase(b2)<0) {
				booklist.set(i, b2);
				booklist.set(i-1, b1);
			}
				
			}
		}
		
	public void display() {
		System.out.println(this.name+" book details");
		for(String name:booklist) {
			System.out.println(name);
		}
	}
	
	
}
