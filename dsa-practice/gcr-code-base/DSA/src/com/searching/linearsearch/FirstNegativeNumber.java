package com.searching.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNegativeNumber {
		
	public static int firstNegative(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				return i;
		}
		return -1;
	}
  public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=kb.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextInt();
		}
		
		int k=firstNegative(arr);
		System.out.println(k!=-1?"Negative at index "+k:"No negative found");
		
	}
}
