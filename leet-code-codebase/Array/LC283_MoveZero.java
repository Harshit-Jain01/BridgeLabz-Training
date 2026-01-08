import java.util.*;

public class LC283_MoveZero{

    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        int diff = nums.length - j;
        int n = nums.length - 1;
        for (int i = 1; i <= diff; i++) {
            nums[n] = 0;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements (include zeroes):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);

        System.out.println("Array after moving all zeroes to the end:");
        for (int x : nums) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
