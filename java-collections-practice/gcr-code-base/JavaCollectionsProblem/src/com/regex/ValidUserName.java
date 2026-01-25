package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {
	
	public static boolean isValidUserName(String exp) {
		Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
		Matcher m=p.matcher(exp);
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the username");
		String username=kb.nextLine();
		boolean result=isValidUserName(username);
		System.out.println(result?"Valid":"Invalid");
		
	}

}
