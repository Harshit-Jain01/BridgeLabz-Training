package com.generics.multilevelcoursemanagementsystem;

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through assignments and projects.");
    }
}
