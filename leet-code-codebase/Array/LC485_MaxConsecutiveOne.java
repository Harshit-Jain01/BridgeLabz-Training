import java.util.*;

class LC485_MaxConsecutiveOne{

    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, max = 0;

        for (int x : nums) {
            if (x == 1) {
                c++;
            } else {
                c = 0;
            }
            max = Math.max(max, c);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones:");
        System.out.println(result);

        sc.close();
    }
}
