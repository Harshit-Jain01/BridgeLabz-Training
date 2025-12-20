import java.util.Scanner;

public class NumberCheck{

    // check positive or negative
    public static boolean isPositive(int num) {
        if (num >= 0)
            return true;
        else
            return false;
    }

    // check even or odd
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    // compare two numbers
    public static int compare(int n1, int n2) {
        if (n1 > n2)
            return 1;
        else if (n1 == n2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int[] arr=new int[5];

        // taking input
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number "+(i+1));
            arr[i]=kb.nextInt();
        }

        // checking each number
        for(int i=0;i<arr.length;i++){

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");

                if (isEven(arr[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(arr[i]+" is Negative");
            }
        }

        //comparing first and last element
        int result=compare(arr[0],arr[arr.length-1]);

        if (result==1)
            System.out.println("First element is greater than last element");
        else if (result==0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last element");

        kb.close();
    }
}
