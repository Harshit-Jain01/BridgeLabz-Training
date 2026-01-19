package com.collectionsframework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortedSet {
	
	public static List<Integer> sortSet(Set<Integer>s1){
		List<Integer>list=new ArrayList<>();
		list.addAll(s1);
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j>0;j--) {
				int n1=list.get(j);
				int n2=list.get(j-1);
				if(list.get(j)<list.get(j-1))
				{
					list.set(j,n2);
					list.set(j-1,n1);
				}
				else break;
			}
			
		}
		return list;	
	}
	
	public static void main(String[] args) {
		
		Set<Integer>s1=new HashSet<>();
		s1.add(82);
		s1.add(4);
		s1.add(6);		
		
		System.out.println("Before sorting "+s1);
		System.out.println("sorted list is"+SortedSet.sortSet(s1));
		
	}
}