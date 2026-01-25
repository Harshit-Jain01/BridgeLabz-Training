package com.regex;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the string");
		String exp=kb.nextLine();
		  String regex = "\\b(Java|Python|JavaScript|Go)\\b";

	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(exp);

	        System.out.println("Programming Languages found:");

	        while (m.find()) {
	            System.out.println(m.group());
	        }
		
		
	}
}
