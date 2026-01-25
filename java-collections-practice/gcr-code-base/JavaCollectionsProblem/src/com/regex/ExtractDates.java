package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the string");
		String exp=kb.nextLine();
		Pattern p=Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		
		String []arr=exp.split("\\s+");
		
		//matches the date
		for(String x:arr) {
			x = x.replaceAll("[^0-9/]", "");
			Matcher m=p.matcher(x);
			if(m.matches())
				System.out.println(x);
				
		}
		
	}

}
