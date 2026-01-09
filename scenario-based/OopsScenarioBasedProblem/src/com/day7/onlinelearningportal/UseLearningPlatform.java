package com.day7.onlinelearningportal;

public class UseLearningPlatform {
		public static void main(String[] args) {
			Instructor instructor = new Instructor("Alice", "alice@skillforge.com");
		    Student student = new Student("Bob", "bob@skillforge.com");

		    Course course1 = new BeginnerCourse("Java Basics", instructor.getName());
		    Course course2 = new AdvancedCourse("Advanced Java", instructor.getName());

		    Grade grade = new Grade(72);

		    System.out.println("Student Grade: " + grade.getGrade());
		    System.out.println("Result: " + (grade.isPassed() ? "Passed" : "Failed"));

		    System.out.println("\nCertificates:");
		    System.out.println(course1.generateCertificate());
		    System.out.println(course2.generateCertificate());
		}
 }
