package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
	
	public static boolean isValidHexColorCode(String color) {
		Pattern p=Pattern.compile("^[#][A-Fa-f0-9]{6}$");
		Matcher m=p.matcher(color);
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the color code");
		String color=kb.nextLine();
		boolean result=isValidHexColorCode(color);
		System.out.println(result?"Valid":"Invalid");
}
}
