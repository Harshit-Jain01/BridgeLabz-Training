import java.util.Scanner;

class LC2006_CountDifference{ 

    public static int countKDifference(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k)
                    c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        // take array size
        System.out.println("Enter size of array");
        int n=kb.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i]=kb.nextInt();
        }

        System.out.println("Enter k");
        int k=kb.nextInt();

        int result=countKDifference(nums,k);
        System.out.println("Count of pairs with difference k: "+result);

        kb.close();
    }
}
