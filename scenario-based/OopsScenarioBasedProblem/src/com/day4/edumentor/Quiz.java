package com.day4.edumentor;

import java.util.*;

class Quiz {

    private String[] questions;     
    private final int[] answers;    
    private int score;

    public Quiz(String[] questions, int[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;

        if (difficulty.equalsIgnoreCase("easy")) {
            this.score = 0;
        } else if (difficulty.equalsIgnoreCase("medium")) {
            this.score = 5;
        } else {
            this.score = 10;
        }
    }
    
    public void evaluate(int[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score += 10;
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / (answers.length * 10);
    }
}
