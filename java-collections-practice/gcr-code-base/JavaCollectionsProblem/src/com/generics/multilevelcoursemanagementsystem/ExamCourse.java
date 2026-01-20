package com.generics.multilevelcoursemanagementsystem;

class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through written examinations.");
    }
}
