package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the string");
		String exp=kb.nextLine();
		Pattern p=Pattern.compile("[A-Z][a-zA-Z]*");
		
		String []arr=exp.split("\\s+");
		
		//matches the capitalised words
		for(String x:arr) {
			x = x.replaceAll("[^a-zA-Z]", "");
			Matcher m=p.matcher(x);
			if(m.matches())
				System.out.println(x);
				
		}

}
   }
