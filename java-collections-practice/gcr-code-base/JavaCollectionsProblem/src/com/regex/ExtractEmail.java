package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the string");
		String exp=kb.nextLine();
		Pattern p=Pattern.compile("^[a-zA-Z0-9._]+[@][a-zA-Z._]+\\.[a-zA-Z]{2,}");
		
		String []arr=exp.split("\\s+");
		//extract the email
		for(String x:arr) {
			Matcher m=p.matcher(x);
			if(m.matches())
				System.out.println(x);
				
		}
	}
	
}
