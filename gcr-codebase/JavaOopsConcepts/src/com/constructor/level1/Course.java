package com.constructor.level1;

public class Course{
  private String courseName;
  private int duration;
  private double fee;
  private static String instituteName="IIT Delhi";

Course(String courseName,int duration,double fee){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
  }

  public void displayCourseDetails(){
    System.out.println("Institute Name:"+instituteName);
   System.out.println("Course Name:"+courseName);
   System.out.println("Duration:"+duration+" months");
   System.out.println("Fee:₹"+fee);
}

 public static void updateInstituteName(String s){
      instituteName=s;
}

  public static void main(String[]args){
Course c1=new Course("Java Full Stack",6,45000);
Course c2=new Course("Data Science",8,65000);
c1.displayCourseDetails();
System.out.println();
c2.displayCourseDetails();
System.out.println("\nUpdating Institute Name...\n");
Course.updateInstituteName("IIT kanpur");
c1.displayCourseDetails();
}
}
