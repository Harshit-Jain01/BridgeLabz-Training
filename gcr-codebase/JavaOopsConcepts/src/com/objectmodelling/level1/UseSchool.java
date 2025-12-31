package com.objectmodelling.level1;

public class UseSchool {

    public static void main(String[] args){

        // Aggregation: school has students
        School school=new School("ABC Public School");

        Student s1=new Student(1,"Aman");
        Student s2=new Student(2,"Neha");

        school.addStudent(s1);
        school.addStudent(s2);

        // Association: students and courses (many-to-many)
        Course math=new Course("Mathematics");
        Course sci=new Course("Science");

        s1.enrollCourse(math);
        s1.enrollCourse(sci);
        s2.enrollCourse(math);

        math.addStudent(s1);
        math.addStudent(s2);
        sci.addStudent(s1);

        s1.showCourses();
        math.showStudents();
    }
}
