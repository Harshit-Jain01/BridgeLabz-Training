package com.day4.edumentor;

import java.util.*;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner("Harshit","harshit@mail.com",101,true);
        Instructor instructor = new Instructor("Dr. Smith","smith@mail.com",201);

        Quiz quiz = new Quiz("easy");

        List<String> answers = Arrays.asList("yes");
        quiz.attemptQuiz(answers);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");

        learner.generateCertificate();
        instructor.generateCertificate();
    }
}
