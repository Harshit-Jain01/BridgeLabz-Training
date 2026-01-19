package com.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	
	public static Set<Integer> difference(Set<Integer>s1,Set<Integer>s2){
		Set<Integer>s3=new HashSet<>();
		for(int x:s1) {
			if(!s2.contains(x))
				s3.add(x);
		}
		for(int x:s2) {
			if(!s1.contains(x))
				s3.add(x);
		}
		return s3;
		
	}
	
	public static void main(String[] args) {
		Set<Integer>s1=new HashSet<>();
		s1.add(2);
		s1.add(4);
		s1.add(6);
		s1.add(8);
		System.out.println("Set1 "+s1);
		Set<Integer>s2=new HashSet<>();
		s2.add(4);
		s2.add(2);
		s2.add(10);
		s2.add(30);
		
		System.out.println("Set2 "+s2);
		
		System.out.println("symmetric difference"+SymmetricDifference.difference(s1, s2));

		
	}

}

