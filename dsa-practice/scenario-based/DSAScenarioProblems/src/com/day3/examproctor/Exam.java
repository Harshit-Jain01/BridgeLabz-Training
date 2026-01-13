package com.day3.examproctor;

public class Exam {
	    public static void main(String[] args) {
	    	
	        EvaluateScore exam = new EvaluateScore();

	        exam.visitQuestion(1);
	        exam.submitAnswer(1, "A");

	        exam.visitQuestion(2);
	        exam.submitAnswer(2, "D");

	        exam.visitQuestion(3);
	        exam.submitAnswer(3, "B");

	        exam.submitExam();
	    }
	}