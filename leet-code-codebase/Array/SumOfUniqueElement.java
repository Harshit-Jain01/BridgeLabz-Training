import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class SumOfUniqueElement{

    // method to find sum of unique elements
   
   public static int sumOfUnique(int[] nums){

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int s=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1)
                s+=e.getKey();
        }
        return s;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        // taking array size
        System.out.println("Enter size of array");
        int n=input.nextInt();

        int[] nums=new int[n];

        // taking array elements
		  System.out.println("Enter number");
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }

        // calling method
        int result=sumOfUnique(nums);
        System.out.println("Sum of unique elements = "+result);

        input.close();
    }
}
