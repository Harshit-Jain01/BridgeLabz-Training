package com.day3.examproctor;

import java.util.*;

public class EvaluateScore {
  
    Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();
    
    public EvaluateScore() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public int goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return -1;
        }
        return navigationStack.pop();
    }

    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }

    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("Exam submitted!");
        System.out.println("Final Score: " + finalScore);
    }
 
}