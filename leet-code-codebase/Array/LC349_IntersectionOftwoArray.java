import java.util.HashSet;
import java.util.Set;

class LC349_IntersectionOftwoArray{

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }

        for (int x : nums2) {
            if (set.contains(x)) {
                ans.add(x);
            }
        }
        int[] arr = new int[ans.size()];
        int i = 0;
        for (int a : ans) {
            arr[i++] = a;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.print("Intersection: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
