package com.day4.hospitalqueue;

public class Hospital {
	public static void main(String[] args) {
		
		    Patient p1  = new Patient("Aarav",101, 1);
	        Patient p2  = new Patient("Bhavesh",102, 6);
	        Patient p3  = new Patient("Kunal",103, 2);
	        Patient p4  = new Patient("Neha", 104, 4);
	        Patient p5  = new Patient("Rohit",105, 9);
	        Patient p6  = new Patient("Ananya",106, 5);
	        Patient p7  = new Patient("Vikram",107, 7);
	        Patient p8  = new Patient("Sneha",108, 8);
	        Patient p9  = new Patient("Aditya",109, 3);
	        Patient p10 = new Patient("Pooja",110, 1);
	        
	        Patient.patientDetails();
	        
	        //sorting patient according to critical level
	        Patient.sortPatient();
	        System.out.println("Sorted according to critical level");
	        
	        Patient.patientDetails();
		
	}
}
