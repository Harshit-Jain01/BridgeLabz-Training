import java.util.Scanner;

public class YoungestAndTallest{

    // find youngest friend
    public static int youngest(int[] age) {
        int pos = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    // find tallest friend
    public static int tallest(double[] height) {
        int pos = 0;

        for (int i = 1; i < 3; i++) {
            if (height[i] > height[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        // input for Amar
        System.out.println("Enter age of Amar");
        age[0] = sc.nextInt();
        System.out.println("Enter height of Amar");
        height[0] = sc.nextDouble();

        // input for Akbar
        System.out.println("Enter age of Akbar");
        age[1] = sc.nextInt();
        System.out.println("Enter height of Akbar");
        height[1] = sc.nextDouble();

        // input for Anthony
        System.out.println("Enter age of Anthony");
        age[2] = sc.nextInt();
        System.out.println("Enter height of Anthony");
        height[2] = sc.nextDouble();

        int y = youngest(age);
        int t = tallest(height);

        if (y == 0)
            System.out.println("Youngest friend is Amar");
        else if (y == 1)
            System.out.println("Youngest friend is Akbar");
        else
            System.out.println("Youngest friend is Anthony");

        if (t == 0)
            System.out.println("Tallest friend is Amar");
        else if (t == 1)
            System.out.println("Tallest friend is Akbar");
        else
            System.out.println("Tallest friend is Anthony");

        sc.close();
    }
}
