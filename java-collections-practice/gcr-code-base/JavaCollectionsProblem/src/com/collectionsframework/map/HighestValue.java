package com.collectionsframework.map;

import java.util.*;

public class HighestValue {
	
	static public String highestValue(Map<String, Integer>map) {
		 int max = Integer.MIN_VALUE;
		String result="";
		for(Map.Entry<String,Integer> m:map.entrySet()) {
			int value=m.getValue();
			if(max<value) {
				result=m.getKey();
				max=value;
			}
					}
		return result;
	}
	
	public static void main(String[] args) {
		
		 Map<String, Integer>map=new HashMap<>();
		 map.put("A",10);
		 map.put("B",40);
		 map.put("D",80);
		 map.put("R",800);
		 map.put("P",80);
		 map.put("V",19);
		 
		 System.out.println(HighestValue.highestValue(map));
}
}