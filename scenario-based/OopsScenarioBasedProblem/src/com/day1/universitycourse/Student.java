package com.day1.universitycourse;

import java.util.HashMap;
import java.util.Map;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected String electivePreference;

    private Map<String, Double> grades = new HashMap<>(); // Encapsulation

    // Constructor without elective
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective
    public Student(String studentId, String name, String electivePreference) {
        this(studentId, name);
        this.electivePreference = electivePreference;
    }

    public void addGrade(String courseCode, double grade) {
        grades.put(courseCode, grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        double total = 0;
        for (double g : grades.values()) {
            total += g;
        }
        return grades.size() == 0 ? 0 : total / grades.size();
    }

    // Public method to access transcript
    public void viewTranscript() {
        System.out.println("Transcript for " + name);
        grades.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("GPA: " + calculateGPA());
    }

    public abstract String getLevel();
}
