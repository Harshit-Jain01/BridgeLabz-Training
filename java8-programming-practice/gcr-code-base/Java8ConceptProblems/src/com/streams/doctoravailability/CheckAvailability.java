package com.streams.doctoravailability;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckAvailability {
	public static void main(String[] args) {
		
		List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("Dr. Sharma", true, "Cardiologist"));
        doctors.add(new Doctor("Dr. Mehta", false, "Neurologist"));
        doctors.add(new Doctor("Dr. Rao", true, "Orthopedic"));
        doctors.add(new Doctor("Dr. Khan", true, "Pediatrician"));
        doctors.add(new Doctor("Dr. Singh", false, "Dermatologist"));
        doctors.add(new Doctor("Dr. Patel", true, "General Physician"));
        doctors.add(new Doctor("Dr. Iyer", true, "ENT"));
		
        Stream<Doctor> mystream=doctors.stream();
        System.out.println("Based on availability on weekends");
        mystream.filter(x->x.isAvailable==true).sorted((a,b)->a.specialist.compareTo(b.specialist)).forEach(System.out::println);
		
	}
}
