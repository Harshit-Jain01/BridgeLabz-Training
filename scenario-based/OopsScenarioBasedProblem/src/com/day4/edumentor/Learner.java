package com.day4.edumentor;

public class Learner extends User implements ICertifiable {

    private boolean shortCourse; // encapsulated

    public Learner(String name, String email, int userId, boolean shortCourse) {
        super(name, email, userId);
        this.shortCourse = shortCourse;
    }

    @Override
    public void generateCertificate() {
        if (shortCourse) {
            System.out.println("Short Course Certificate issued to " + name);
        } else {
            System.out.println("Full-Time Course Certificate issued to " + name);
        }
    }
}

