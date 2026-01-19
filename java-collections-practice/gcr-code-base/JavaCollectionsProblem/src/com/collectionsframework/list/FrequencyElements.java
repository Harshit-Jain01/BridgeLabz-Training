package com.collectionsframework.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyElements {

	public  static Map<String,Integer> count(List<String>list){
		 Map<String,Integer> map=new HashMap<>();
		 for(int i=0;i<list.size();i++) {
			 String name=list.get(i);
			 map.put(name,map.getOrDefault(name, 0)+1);
		 }
		 return map;
	}
	
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("pear");
		list.add("apple");
		
		System.out.println(list);
		
		Map<String,Integer>map=FrequencyElements.count(list);
		
		for(Map.Entry<String,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"->"+m.getValue());
		}
		
		
	}
	
}
