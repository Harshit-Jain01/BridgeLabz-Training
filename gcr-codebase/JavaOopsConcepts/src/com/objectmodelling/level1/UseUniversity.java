package com.objectmodelling.level1;

public class UseUniversity {
	    public static void main(String[] args){

	        // Aggregation: faculty exists independently
	        Faculty f1=new Faculty(1,"Amit");
	        Faculty f2=new Faculty(2,"Neeraj");

	        // Composition: university owns departments
	        University uni=new University("Global University");
	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.displayUniversity();

	        // Deleting university removes departments
	        uni=null;

	        System.out.println("University deleted, departments removed.");
	        System.out.println("Faculty still exists: "+f1.getName());
	    }
	

}
