package com.inheritance.multilevel.educationalcourse;

public class UseCourse {

    public static void main(String[] args) {

        Course c = new Course("Java Basics", 40);
        c.getCourseDetails();

        System.out.println("-----");

        OnlineCourse oc = new OnlineCourse("Java Online", 50, "Coursera", true);
        oc.getCourseDetails();

        System.out.println("-----");

        PaidOnlineCourse poc =
                new PaidOnlineCourse("Advanced Java", 60,
                        "Udemy", true, 5000, 20);
        poc.getCourseDetails();
    }
}
