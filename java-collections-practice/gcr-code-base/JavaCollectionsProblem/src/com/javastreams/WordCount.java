package com.javastreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
	
	public static void main(String[] args) {
		
		Map<String,Integer>map=new TreeMap<>();
		try(BufferedReader br=new BufferedReader(new FileReader("src/com/javastreams/input.txt")))
		{
			String line;
			while((line=br.readLine())!=null) {
				line=line.toLowerCase();
				String []arr=line.split("\\s+");
				for(int i=0;i<arr.length;i++) {
					map.put(arr[i],map.getOrDefault(arr[i],0)+1);
				}	
			}
			List<Map.Entry<String,Integer>>list=new ArrayList<>();
			list.addAll(map.entrySet());
			Collections.sort(list,(a,b)->b.getValue()-a.getValue());
			for(int i=0;i<list.size()&&i<5;i++) {
				Map.Entry<String,Integer>m=list.get(i);
				System.out.println(m.getKey()+": "+m.getValue());
			}		
		}
		catch(IOException i) {
			System.out.println("Error occured in I/O operation");
		}
	}

}
