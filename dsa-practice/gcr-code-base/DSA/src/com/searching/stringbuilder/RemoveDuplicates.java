package com.searching.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeDuplicate(String s) {
		StringBuilder sb=new StringBuilder();
		Set<Character>set=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(set.add(c))
				sb.append(c);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		System.out.println("Original string "+s);
		System.out.println("After removing duplicates "+removeDuplicate(s));
		
		
	}
}
