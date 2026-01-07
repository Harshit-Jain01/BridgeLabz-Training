package com.searching.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		System.out.println("Original string "+s);
		System.out.println("Reverse string "+reverse(s));
		
		
	}


}
