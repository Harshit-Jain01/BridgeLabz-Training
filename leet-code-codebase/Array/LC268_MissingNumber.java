import java.util.*;

public class LC268_MissingNumber{

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int x : nums) {
            sum = sum - x;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of elements (n):");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers from 0 to " + n + " (one number missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing =missingNumber(nums);

        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
