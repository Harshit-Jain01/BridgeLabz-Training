import java.util.*;

public class LC260_SingleNumberIII{

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] arr = new int[2];
        int i = 0;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                arr[i] = m.getKey();
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result =singleNumber(nums);

        System.out.println("Single numbers are:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
