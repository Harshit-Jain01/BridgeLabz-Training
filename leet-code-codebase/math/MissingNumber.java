import java.util.Scanner;

class MissingNumber{
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int x:nums)
            sum-=x;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println("Missing number: "+missingNumber(nums));
        sc.close();
    }
}
