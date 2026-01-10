package com.day1.ambulanceroute;

public class UseHospital {
	    public static void main(String[] args) {

	        AmbulanceRoute route = new AmbulanceRoute();

	        route.addUnit("Emergency", false);
	        route.addUnit("Radiology", false);
	        route.addUnit("Surgery", true);
	        route.addUnit("ICU", false);

	        route.displayUnits();
	        route.redirectPatient();

	        route.removeUnit("Radiology");
	        route.displayUnits();

	        route.redirectPatient();
	    }
	    
}
