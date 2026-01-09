package com.day7.onlinelearningportal;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String generateCertificate() {
        return "Advanced Professional Certification";
    }
}

