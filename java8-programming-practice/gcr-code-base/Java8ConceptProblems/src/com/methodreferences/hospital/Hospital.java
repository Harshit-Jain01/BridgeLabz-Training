package com.methodreferences.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital{

	public static void main(String []args) {
		
		// Creating Patient object
		Patient p5=new Patient("Raj", 101);
		Patient p1=new Patient("Divya", 102);
		Patient p2=new Patient("Amit", 103);
		Patient p3=new Patient("Sudha", 104);
		Patient p4=new Patient("Yukta", 134);
		
		//List of patient 
		List<Patient> plist=new ArrayList<>();
		
		plist.add(p5);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		
		//Method reference 
		plist.forEach(Patient::display);
		
	}

}