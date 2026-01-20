package com.generics.multilevelcoursemanagementsystem;

abstract class CourseType {
    protected String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public abstract void evaluate();

    public String getEvaluationType() {
        return evaluationType;
    }
}
