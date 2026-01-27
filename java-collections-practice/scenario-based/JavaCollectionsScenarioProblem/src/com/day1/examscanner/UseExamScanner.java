package com.day1.examscanner;

public class UseExamScanner {
	  public static void main(String[] args) {
		  
	 // choose subject
    MathAnswerSheet mathKey = new MathAnswerSheet();
    ExamScanner<MathAnswerSheet> mathScanner = new ExamScanner<>(mathKey);

    // change to your actual file path
    String csvFile = "src/samplefiles/myrepo/mathanswers.csv";

    System.out.println("Processing Math exam answers...");
    mathScanner.processFile(csvFile);
    mathScanner.showResults();

    // example for another subject
     ScienceAnswerSheet scienceKey = new ScienceAnswerSheet();
     ExamScanner<ScienceAnswerSheet> scienceScanner = new ExamScanner<>(scienceKey);
     scienceScanner.processFile("src/samplefiles/myrepo/scienceanswers.csv");
     scienceScanner.showResults();
}
}
