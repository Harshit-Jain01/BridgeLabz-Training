package com.generics.multilevelcoursemanagementsystem;

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through research papers and thesis.");
    }
}
