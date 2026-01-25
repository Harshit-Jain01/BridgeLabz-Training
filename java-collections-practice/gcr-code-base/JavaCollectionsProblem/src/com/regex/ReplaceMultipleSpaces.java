package com.regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner kb=new Scanner(System.in);
		String line=kb.nextLine();
		line=line.replaceAll("\\s+", " ");
		System.out.println(line);
		
		
	}
}
