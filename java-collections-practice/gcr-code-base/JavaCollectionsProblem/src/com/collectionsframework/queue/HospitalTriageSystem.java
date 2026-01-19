package com.collectionsframework.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient{
	String name;
	int severity;
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}	
	public String toString() {
        return name + " (Severity: " + severity + ")";
    }
	
}

class Severity implements Comparator<Patient>{

	@Override
	public int compare(Patient p1, Patient p2) {
		return p2.severity-p1.severity;
	}
	
}
public class HospitalTriageSystem {
	public static void main(String[] args) {
		
		PriorityQueue<Patient> queue=new PriorityQueue<>(new Severity());
		queue.add(new Patient("Mohan",4));
		queue.add(new Patient("Rohan",2));
		queue.add(new Patient("Sohan",8));
		queue.add(new Patient("Mohit",6));
		queue.add(new Patient("Rohit",6));
		
		while(!queue.isEmpty())
		System.out.println(queue.poll());
		
	}
}
