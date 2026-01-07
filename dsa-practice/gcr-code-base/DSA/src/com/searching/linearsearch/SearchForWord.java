package com.searching.linearsearch;

import java.util.Scanner;

public class SearchForWord {
	
public static String searchForWord(String []arr,String word) {
			for(int i=0;i<arr.length;i++) {
				String []s=arr[i].split("\\s+");
				for(int j=0;j<s.length;j++ ) {
					if(word.equals(s[j]))
					return arr[i];
				}
			}
				
				return "Not found";
			}

  public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter number of sentence");
		int n=kb.nextInt();
		System.out.println("Enter sentence");
		String []arr=new String[n];
		kb.next();
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextLine();
		}
		System.out.println("Enter word to search");
		String word=kb.nextLine();
		System.out.println(searchForWord(arr,word));
		
	}
}
