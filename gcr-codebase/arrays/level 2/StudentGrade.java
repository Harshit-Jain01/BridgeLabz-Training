import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
		
     //taking number of students and creating arrays of int,float,char
        int number = input.nextInt();
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        float[] percentage = new float[number];
        char[] grade = new char[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();
            if (physics[i] < 0) {
                System.out.println("Re-enter marks");
                i--;
                continue;
            }

            System.out.print("Chemistry");
            chemistry[i] =input.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Re-enter marks");
                i--;
                continue;
            }

            System.out.print("Math");
            maths[i] =input.nextInt();
            if (maths[i] < 0) {
                System.out.println("Re-enter");
                i--;
                continue;
            }

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0f;

            // Assign grade
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Display results
        System.out.println("\nResult");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics " + physics[i]);
            System.out.println("Chemistry " + chemistry[i]);
            System.out.println("Maths" + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        input.close();
    }
}