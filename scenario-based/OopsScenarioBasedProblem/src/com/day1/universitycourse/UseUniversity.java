package com.day1.universitycourse;

public class UseUniversity{
    public static void main(String[] args) {

        Student s1 = new Undergraduate("U101", "Aman", "AI");
        Student s2 = new Postgraduate("P201", "Neha");

        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS201", "Machine Learning");

        Faculty f1 = new Faculty("Dr. Sharma");

        new Enrollment(s1, c1);
        new Enrollment(s2, c2);

        f1.assignGrade(s1, c1, 8.5);
        f1.assignGrade(s2, c2, 9.2);

        s1.viewTranscript();
        s2.viewTranscript();
    }
}
