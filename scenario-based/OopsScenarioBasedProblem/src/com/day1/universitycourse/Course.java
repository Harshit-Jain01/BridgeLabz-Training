package com.day1.universitycourse;

public class Course {
    private String courseCode;
    private String courseName;

    public Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
