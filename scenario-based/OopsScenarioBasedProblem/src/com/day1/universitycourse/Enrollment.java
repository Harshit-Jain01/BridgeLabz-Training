package com.day1.universitycourse;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        System.out.println(student.name + " enrolled in " + course.getCourseCode());
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
