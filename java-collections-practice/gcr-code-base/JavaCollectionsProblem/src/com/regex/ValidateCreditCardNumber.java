package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
	
	public static void main(String[] args) {
		
		String regex="^(4|5)[0-9]{3} [0-9]{4} [0-9]{4} [0-9]{4}$";
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the credit card (xxxx xxxx xxxx xxxx)");
		String cc=kb.nextLine();
		Pattern p=Pattern.compile(regex);
	
		Matcher m=p.matcher(cc);
			if(m.matches())
				System.out.println("valid card number");
			else 
				System.out.println("Invalid card number");
				
		
	}
		
	}
	
