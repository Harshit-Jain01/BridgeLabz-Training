package com.collectionsframework.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
	
	static public List<Integer> rotatelist(List<Integer>list,int n) {
		List<Integer>mylist=new ArrayList<>();
		for(int i=n;i<list.size();i++) {
			mylist.add(list.get(i));
		}
		for(int i=0;i<n;i++) {
			mylist.add(list.get(i));
		}

		return mylist;
	}
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Before rotation\n"+list);
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number you want to rotate");
		int rot=kb.nextInt();
		List<Integer>result=RotateElements.rotatelist(list, rot);
		System.out.println(result);
		
		
		
	}
}
