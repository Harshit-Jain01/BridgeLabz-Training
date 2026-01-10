package com.day1.libraryorganiser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookShelf {
		private String genre;
		List<Book>list=new LinkedList<>();
		Map<String,List<Book>>map=new HashMap<>();
		
		public void addGenre(String genre,List<Book>list) {
			map.put(genre,list);
		}
		
		public void borrow(String genre,String bookname) {
			List<Book>booklist=map.get(genre);
			for(Book b:booklist) {
				if(b.getTitle().equalsIgnoreCase(bookname) ) {
					if(b.getStock()>0) {
					System.out.println("Book borrowed successfully");
					b.setStock(b.getStock()-1);
					return;	
					}
					else
						System.out.println("Book out of stock");
				}
			}
			System.out.println("Book not available");
		}
		
		public void returnBook(String genre,String bookname) {
			List<Book>booklist=map.get(genre);
			for(Book b:booklist) {
				if(b.getTitle().equalsIgnoreCase(bookname)) {
					System.out.println("Book returned successfully");
					b.setStock(b.getStock()+1);
					return;	
				}
			}
			System.out.println("Wrong Book");
		}
}
