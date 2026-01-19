package com.collectionsframework.map;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {
	
	public static Map<String,Integer> mergeMap(Map<String,Integer> m1,Map<String,Integer> m2){
		Map<String,Integer> mymap=new HashMap<>();
		for(Map.Entry<String,Integer> m:m1.entrySet()) {
			String key=m.getKey();
			int value=m.getValue();
			mymap.put(key,value);		
		}
		
		for(Map.Entry<String,Integer> m:m2.entrySet()) {
			String key=m.getKey();
			int value=m.getValue();
			if(mymap.containsKey(key)) {
				int prev=mymap.get(key);
				mymap.put(key,value+prev);
			}
			else
			mymap.put(key,value);			
		}
		return mymap;
		
	}
	
	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<>();
		map1.put("A",3);
		map1.put("D",13);
		map1.put("C",9);
		map1.put("S",43);
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("B",3);
		map2.put("D",2);
		map2.put("M",12);
		map2.put("Y",4);
		
		System.out.println(MergeMap.mergeMap(map1, map2));
		
	}
}
