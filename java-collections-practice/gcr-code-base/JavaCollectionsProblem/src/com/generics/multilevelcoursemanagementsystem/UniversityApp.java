package com.generics.multilevelcoursemanagementsystem;

import java.util.Arrays;
import java.util.List;

public class UniversityApp {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("PhD Research", new ResearchCourse());

        math.displayCourseDetails();
        cs.displayCourseDetails();
        phd.displayCourseDetails();

        List<CourseType> allCourses = Arrays.asList(
                new ExamCourse(),
                new AssignmentCourse(),
                new ResearchCourse()
        );

        CourseManager.processCourses(allCourses);
    }
}
