package com.day7.onlinelearningportal;


public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String generateCertificate() {
        return "Beginner Level Certificate of Completion";
    }
}
