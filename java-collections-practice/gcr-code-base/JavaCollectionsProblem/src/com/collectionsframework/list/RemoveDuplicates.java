package com.collectionsframework.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	static public List<Integer> removeDupicate(List<Integer> list){
		List<Integer>list1=new ArrayList<>();
		for(int x:list) {
			if(!list1.contains(x))
				list1.add(x);
		}
		return list1;
	}
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		
		
		System.out.println("Original list "+list);
		System.out.println("After removing duplicates"+RemoveDuplicates.removeDupicate(list));
		
		
	}
	
}
