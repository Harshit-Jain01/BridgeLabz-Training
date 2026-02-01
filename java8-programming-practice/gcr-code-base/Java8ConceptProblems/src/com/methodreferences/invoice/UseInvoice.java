package com.methodreferences.invoice;

import java.util.List;

public class UseInvoice {

public static void main(String[]args) {
		
		List<Integer>list= List.of(11,12,13,14,15);
		
		List<Invoice>mylist=list.stream().map(Invoice::new).toList();
		
		mylist.forEach(System.out::println);
	}
}
