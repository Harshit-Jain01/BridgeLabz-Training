package com.searching.stringbuffer;

import java.util.Arrays;
import java.util.Scanner;

public class ConcateString {
	public static String concateAllString(String []arr) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 5 string");
		String []arr=new String[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextLine();
		}
		
		System.out.println("Array of string "+Arrays.toString(arr));
		System.out.println("After concatenation "+concateAllString(arr));
		
	}
}
