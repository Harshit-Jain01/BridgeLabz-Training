import java.util.Scanner;

public class SumOfNumbers{

    // using recursion
    public static int sumRecursive(int n) {
        if (n == 0)
            return 0;
        return n + sumRecursive(n - 1);
    }

    //  using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = kb.nextInt();

        // check natural number
        if (number <= 0) 
            System.out.println("Please enter a natural number");
        else {
            int sum1 = sumRecursive(number);
            int sum2 = sumFormula(number);

            System.out.println("Sum using recursion = " + sum1);
            System.out.println("Sum using formula = " + sum2);

            if (sum1 == sum2)
                System.out.println("Both results are correct and equal");
            else
                System.out.println("Results are not equal");
        }

        kb.close();
    }
}
