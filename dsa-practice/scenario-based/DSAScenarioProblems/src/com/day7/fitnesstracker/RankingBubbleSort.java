package com.day7.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

public class RankingBubbleSort {
	
	static public List<User> getrank(List<User>list){
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				User s1=list.get(j);
				User s2=list.get(j+1);
				if(list.get(j).steps<list.get(j+1).steps) {
					list.set(j, s2);
					list.set(j+1, s1);
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		List<User>list=new ArrayList();
		list.add(new User("Mohan",300));
		list.add(new User("Arjun",100));
		list.add(new User("Bob",400));
		list.add(new User("alice",20));
		list.add(new User("Jyoti",800));
		list.add(new User("Aditi",40));
		
		System.out.println("Before sorting");
		 for(User u:list) {
			 System.out.println(u.name+" "+u.steps);
		 }
		
		 System.out.println("After sorting");
		List<User>resultlist=RankingBubbleSort.getrank(list);
		 for(User u:resultlist) {
			 System.out.println(u.name+" "+u.steps);
		 }
		
		
	}

}
