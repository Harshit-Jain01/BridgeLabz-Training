package com.day4.hospitalqueue;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Patient {
	
	private static List<Patient>list=new ArrayList<>();
	private int pat_id;
	private int criticalLevel;
	private LocalTime arrivalTime;
	private String name;
	
	public Patient(String name,int pat_id, int criticalLevel) {
		this.pat_id = pat_id;
		this.criticalLevel = criticalLevel;
		arrivalTime=LocalTime.now();
		this.name=name;
		list.add(this);
	}
	
	public static void patientDetails() {
		for(Patient p:list) {
			System.out.println(p.name+","+p.pat_id+","+p.criticalLevel);
		}
	}
	
	public static void sortPatient() {
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				Patient p1=list.get(j);
				int t1=p1.criticalLevel;
				Patient p2=list.get(j+1);
				int t2=p2.criticalLevel;
				if(t2>t1) {
					list.set(j,p2);
					list.set(j+1,p1);		
				}
			}
		}
	}
	
	
}
