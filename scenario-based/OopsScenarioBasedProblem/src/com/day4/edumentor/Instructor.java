package com.day4.edumentor;

public class Instructor extends User implements ICertifiable {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Instructor Certification generated for " + name);
    }
}
