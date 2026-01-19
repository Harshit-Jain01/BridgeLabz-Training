package com.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

public class Subsets{
	
	public static boolean isSubset(Set<Integer>s1,Set<Integer>s2) {
		if(s1.size()>s2.size())return false;
		for(int x:s1)
		{
			if(!s2.contains(x))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Set<Integer>s1=new HashSet<>();
		s1.add(2);
		s1.add(6);
		s1.add(1);
		System.out.println("Set1 "+s1);
		Set<Integer>s2=new HashSet<>();
		s2.add(6);
		s2.add(2);
		s2.add(16);
		s2.add(30);
		
		System.out.println("Set2 "+s2);
		
		System.out.println(Subsets.isSubset(s1, s2)?"s1 is subset of s2":"s1 is not subset of s2");

		
	}

}

