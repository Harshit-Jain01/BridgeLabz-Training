import java.util.*;

public class LC75_SortColors{

    // static method
    public static void sortColors(int[] nums) {
        int z = 0, o = 0, t = 0;

        // count 0s, 1s, and 2s
        for (int i : nums) {
            if (i == 0)
                z++;
            else if (i == 1)
                o++;
            else
                t++;
        }

        // overwrite array
        for (int i = 0; i < nums.length; i++) {
            if (i < z)
                nums[i] = 0;
            else if (i < z + o)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        System.out.print("Sorted colors: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
