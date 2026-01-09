package com.day7.onlinelearningportal;

public class Grade {
    private int score;

    public Grade(int score) {
        this.score = score;
    }

    public boolean isPassed() {
        return score >= 40;
    }

    public char getGrade() {
        if (score >= 80) return 'A';
        else if (score >= 60) return 'B';
        else if (score >= 40) return 'C';
        else return 'F';
    }
}
