package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceBadWords {
	
	public static void main(String[] args) {
		List<String>badwords=List.of("stupid","idiot","dumb","fool","nonsense","damn");
		
		System.out.println("enter the string");
		Scanner kb=new Scanner(System.in);
		String text=kb.nextLine();
		for(String x:badwords) {
			text = text.replaceAll("(?i)\\b" + x + "\\b", "****");
		}
		
		System.out.println(text);
	}
	
}
