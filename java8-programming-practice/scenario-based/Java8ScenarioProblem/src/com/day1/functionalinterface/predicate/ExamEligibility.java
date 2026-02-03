package com.day1.functionalinterface.predicate;

import java.util.function.Predicate;

public class ExamEligibility {
    public static void main(String[] args) {

        Predicate<Integer> isEligibleForExam = attendance -> attendance >= 75;

        int attendance = 80;

        System.out.println(
            isEligibleForExam.test(attendance)
            ? "Student is eligible for exam"
            : "Student is NOT eligible for exam"
        );
    }
}