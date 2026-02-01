package com.methodreferences.uppercasing;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	
	public static void main(String[] args) {
		
		List<String>empname=new ArrayList<>();
		empname.add("Divya");
		empname.add("Amit");
		empname.add("Raj");
		empname.add("Yukta");
		empname.add("Deep");
		
		//Using stream converted lower case to upper case
		empname.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}

}
