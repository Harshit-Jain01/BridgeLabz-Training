package com.collectionsframework.queue;

import java.util.*;

public class BinaryNumber {
	
	public static Queue<String> getBinaryNumber(int n){
		Queue<String>queue=new LinkedList<>();
		for(int i=1;i<=n;i++) {
			StringBuilder sb=new StringBuilder("");
			int num=i;
			while(num!=0) {
				sb.append(num%2);
				num/=2;
			}
			queue.add(sb.reverse().toString());
		}
		return queue;			
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=kb.nextInt();
		
		System.out.println(BinaryNumber.getBinaryNumber(n));
	}

}
