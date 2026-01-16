import java.util.*;

public class LC561_ArrayPartition{

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (even count): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = arrayPairSum(nums);
        System.out.println("Maximum sum of min pairs = " + result);

        sc.close();
    }
}
