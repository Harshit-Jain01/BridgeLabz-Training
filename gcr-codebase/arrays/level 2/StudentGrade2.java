import java.util.Scanner;

public class StudentGrade2{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
		
		//take number of student
        System.out.print("Enter number of students: ");
        int number=input.nextInt();

        // 2D array to store marks (0-Physics, 1-Chemistry, 2-Maths)
        int[][] marks = new int[number][3];
        float[] percentage = new float[number];
        char[] grade = new char[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics");
            marks[i][0] = input.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("not negative Marks");
                i--;
                continue;
            }

            System.out.print("Chemistry");
            marks[i][1] =input.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("not negative Marks");
                i--;
                continue;
            }

            System.out.print("Maths");
            marks[i][2] =input.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("not negative Marks");
                i--;
                continue;
            }

            // find percentage using 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0f;

            //grade
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

        //  results
        System.out.println("\nResult");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics" + marks[i][0]);
            System.out.println("Chemistry " + marks[i][1]);
            System.out.println("Maths" + marks[i][2]);
            System.out.println("Percentage" + percentage[i] + "%");
            System.out.println("Grade" + grade[i]);
            System.out.println();
        }

        input.close();
    }
}