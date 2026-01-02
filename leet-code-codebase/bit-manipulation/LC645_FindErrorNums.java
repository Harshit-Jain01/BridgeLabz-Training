import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class LC645_FindErrorNums{

    public static int[] findErrorNums(int[] nums){

        int n=nums.length;
        int rep=0;
        int sum=0;
        int total=n*(n+1)/2;

        Set<Integer> set=new HashSet<>();

        for(int x:nums){
            if(!set.add(x)){
                rep=x;
            }
            sum+=x;
        }

        int miss=total-(sum-rep);
        return new int[]{rep,miss};
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n=kb.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i]=kb.nextInt();
        }

        int[] result=findErrorNums(nums);
        System.out.println("Repeated number: "+result[0]);
        System.out.println("Missing number: "+result[1]);

        kb.close();
    }
}
