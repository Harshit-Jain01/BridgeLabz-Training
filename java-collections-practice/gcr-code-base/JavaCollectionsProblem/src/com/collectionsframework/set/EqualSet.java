package com.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

public class EqualSet {
	
 static	public boolean isEqual(Set<Integer>s1,Set<Integer>s2) {
		if(s1.size()!=s2.size())return false;
		for(int x:s1) {
			if(!s2.contains(x))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Set<Integer>s1=new HashSet<>();
		s1.add(2);
		s1.add(4);
		s1.add(21);
		s1.add(43);
		System.out.println("Set1 "+s1);
		Set<Integer>s2=new HashSet<>();
		s2.add(4);
		s2.add(2);
		s2.add(21);
		s2.add(432);
		
		System.out.println("Set2 "+s2);
		
		System.out.println(EqualSet.isEqual(s1, s2)?"Two sets are equal":"Two sets are unequal");
		
		
	}

}
