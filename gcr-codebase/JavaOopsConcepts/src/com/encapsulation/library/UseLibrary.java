package com.encapsulation.library;

import java.util.ArrayList;
import java.util.List;

public class UseLibrary {
	public static void main(String[] args) {
		
		List<LibraryItem>list=new ArrayList();
		list.add(new Book("1201b","Fire And Ice","Robert Frost"));
		list.add(new DVD("1202d","Lion and Roar","Tim Berlin"));
		list.add(new Magazine("1202m","Time","Mark Lucy"));
		list.add(new Magazine("1202m","Time","Mark Lucy"));
		
		for(LibraryItem item:list) {
			item.getItemDetails();
			System.out.println(item.getLoanDuration());
			if(item instanceof Reservable) {
				Reservable r=(Reservable)item;
				r.reserveItem();
				
			}
			System.out.println("---");
		}
		
	}
}
