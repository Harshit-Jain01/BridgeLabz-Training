import java.util.Scanner;

public class GradeAndPercentage {
    public static void main(String[] args) {

        // creating object of Scanner and taking physics, chemistry and maths marks
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        // calculating percentage
        double percent = (physics + chemistry + maths) / 3.0;

        // displaying the marks, grade and remarks
        if (percent >= 80)
            System.out.println(percent + " A Level 4, above agency-normalised standards");
        else if (percent >= 70 && percent < 80)
            System.out.println(percent + " B Level 3, at agency-normalised standards");
        else if (percent >= 60 && percent < 70)
            System.out.println(percent + " C Level 2, below but approaching agency-normalised standards");
        else if (percent >= 50 && percent < 60)
            System.out.println(percent + " D Level 1, well below agency-normalised standards");
        else if (percent >= 40 && percent < 50)
            System.out.println(percent + " E Level 1, too below agency-normalised standards");
        else
            System.out.println("Remedial standards");

        input.close();
    }
}
