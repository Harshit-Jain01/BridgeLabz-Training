import java.util.Scanner;

class Monotonic{

    public static boolean isMonotonic(int[] nums) {
        if(nums.length<=2) return true;

        int f=nums[0];
        int s=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=f){
                s=nums[i];
                break;
            }
        }

        if(f==s) return true;

        if(f<s){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1])
                    return false;
            }
        } else {
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // user input
        Scanner input=new Scanner(System.in);

        System.out.println("Enter size:");
        int n=input.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }

        
        System.out.println(isMonotonic(nums));

        input.close();
    }
}
