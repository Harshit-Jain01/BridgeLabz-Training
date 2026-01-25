package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the string");
		String exp=kb.nextLine();
		Pattern p=Pattern.compile("[a-z]{3,}:[/]{2}[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		
		String []arr=exp.split("\\s+");
		
		//matches the link
		for(String x:arr) {
			  x = x.replaceAll("[^a-zA-Z0-9:/.-]", "");
			Matcher m=p.matcher(x);
			if(m.matches())
				System.out.println(x);		
		}
	}
}
