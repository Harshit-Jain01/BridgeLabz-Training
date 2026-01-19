package com.collectionsframework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
	String name;
	String department;
	
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
}

public class GroupObject {
	
	static public Map<String,List<String>> groupByDept(List<Employee>list){
		Map<String,List<String>> map=new HashMap<>();
		for(Employee e:list) {
			String dept=e.department;
			String emp=e.name;
			if(!map.containsKey(dept))
				map.put(dept, new ArrayList<>());
			map.get(dept).add(emp);
			
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		 Employee e1=new Employee("Alice","HR");
		 Employee e2=new Employee("John","IT");
		 Employee e3=new Employee("Rohan","HR");
		 Employee e4=new Employee("Rohan","Finance");
		 Employee e5=new Employee("Deepak","HR");
		 
		 List<Employee>list=new ArrayList<>();
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);
		 list.add(e5);
		 
		 System.out.println(GroupObject.groupByDept(list));
	}
	
}
