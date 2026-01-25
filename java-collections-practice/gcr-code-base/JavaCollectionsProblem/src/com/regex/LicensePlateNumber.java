package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
	
	public static boolean isValidLicense(String exp) {
		Pattern p=Pattern.compile("^[A-Z]{2}[0-9]{4}$");
		Matcher m=p.matcher(exp);
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the license number");
		String license=kb.nextLine();
		boolean result=isValidLicense(license);
		System.out.println(result?"Valid":"Invalid");
}

  }
