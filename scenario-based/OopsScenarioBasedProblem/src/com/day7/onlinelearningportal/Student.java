package com.day7.onlinelearningportal;

public class Student extends User {
    private int progress; 

    public Student(String name, String email) {
        super(name, email);
    }

    
    public void updateProgress(int moduleCompleted) {
        progress += moduleCompleted;
        if (progress > 100) progress = 100;
    }

    public int getProgress() {
        return progress;
    }
}