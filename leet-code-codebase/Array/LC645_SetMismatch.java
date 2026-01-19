import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LC645_SetMismatch{

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int rep = 0;
        int tot = n * (n + 1) / 2;

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int x : nums) {
            if (!set.add(x)) {
                rep = x;
            }
            sum += x;
        }

        return new int[]{rep, tot - (sum - rep)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers (1 to " + n + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findErrorNums(nums);

        System.out.println("Duplicate number is: " + result[0]);
        System.out.println("Missing number is: " + result[1]);

        sc.close();
    }
}
