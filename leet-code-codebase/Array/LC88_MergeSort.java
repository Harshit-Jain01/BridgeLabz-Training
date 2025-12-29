import java.util.*;

public class LC88_MergeSort{

    // static method
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // copy nums2 into nums1
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }

        // sort merged array
        Arrays.sort(nums1);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m (number of elements in nums1):");
        int m = sc.nextInt();

        System.out.println("Enter n (number of elements in nums2):");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int x : nums1) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
