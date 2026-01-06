package com.day4.edumentor;

import java.util.*;

public class Quiz {

    private List<String> questions;      
    private final List<String> answers;   
    private int score;

    // Constructor with difficulty
    public Quiz(String difficulty) {
        questions = new ArrayList<>();
        answers = new ArrayList<>();

        if (difficulty.equalsIgnoreCase("easy")) {
            questions.add("Java is platform independent?");
            answers.add("yes");
        } else {
            questions.add("What is JVM?");
            answers.add("java virtual machine");
        }
    }

   
    public void attemptQuiz(List<String> userAnswers) {
        for (int i = 0; i < userAnswers.size(); i++) {
            if (userAnswers.get(i).equalsIgnoreCase(answers.get(i))) {
                score++; // operator usage
            }
        }
    }

    public int getScore() {
        return score;
    }

    public double calculatePercentage() {
        return (score * 100.0) / questions.size();
    }
}
