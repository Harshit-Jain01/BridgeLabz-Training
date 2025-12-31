import java.util.*;

import java.util.Scanner;

public class OnlineQuizApp{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which data type is used to store true/false?",
            "3. Which loop is guaranteed to run at least once?",
            "4. Which symbol is used for logical AND?",
            "5. Which class is used to take input in Java?"
        };

        String[][] options = {
            {"A. this", "B. super", "C. extends", "D. implements"},
            {"A. int", "B. boolean", "C. char", "D. double"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. &", "B. &&", "C. |", "D. ||"},
            {"A. System", "B. Input", "C. Scanner", "D. Reader"}
        };

        char[] answers={'C', 'B', 'C', 'B', 'C'};

        int score=0;

        for (int i=0;i<questions.length;i++){

            System.out.println("\n" + questions[i]);
            for (int j=0;j<options[i].length;j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        score++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong! Correct answer is " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}
