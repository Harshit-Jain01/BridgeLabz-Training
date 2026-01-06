package com.day4.edumentor;

import java.util.*;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner l1 = new Learner("Hari", "hari867@gmail.com", 101, true);
        Learner l2 = new Learner("Amit", "amit@gmail.com", 102, false);

        String[] questions = {
                "What is OOP?",
                "What is inheritance?"
        };

        int[] correctAnswers = {1, 2};
        Quiz quiz = new Quiz(questions, correctAnswers, "medium");

        int[] userAnswers = {1, 2};
        quiz.evaluate(userAnswers);

        System.out.println("Quiz Percentage: " + quiz.getPercentage());

        
        l1.generateCertificate();
        l2.generateCertificate();
    }
}
