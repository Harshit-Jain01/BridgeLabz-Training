package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter ip adress");
		String ipaddress=kb.nextLine();
		
		Pattern p=Pattern.compile("^([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
		
		//validate the IP
			Matcher m=p.matcher(ipaddress);
			if(m.matches())
				System.out.println("valid ip address");
			else 
				System.out.println("invalid ip addresss");
				
		
	}	

}
