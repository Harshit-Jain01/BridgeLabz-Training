package com.generics.multilevelcoursemanagementsystem;

import java.util.List;

class CourseManager {

    public static void processCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Processing: " + course.getEvaluationType());
            course.evaluate();
        }
    }
}

