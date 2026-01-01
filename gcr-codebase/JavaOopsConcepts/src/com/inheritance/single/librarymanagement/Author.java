package com.inheritance.single.librarymanagement;

public class Author extends Book{
	
	private String name;
	private String bio;
	
	public Author(String title,int year,String name,String bio ) {
		super(title,year);
		this.name=name;
		this.bio=bio;
	}
	public void  displayInfo(){
		System.out.println("Author name is "+name);
		System.out.println("bio is "+bio);
		System.out.println("Book name is "+getTitle());
		System.out.println("Its publication year is "+getPublicationYear());
		
	}
}
