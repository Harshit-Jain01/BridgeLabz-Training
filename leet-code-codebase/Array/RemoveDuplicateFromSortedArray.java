import java.util.Scanner;

class RemoveDuplicateFromSortedArray{

    // remove duplicates method
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int j=1;
        int k=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=k){
                k=nums[i];
                nums[j]=k;
                j++;
            }
        }
        return j;
    }

    // main method
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter size of array");
        int n=kb.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            nums[i]=kb.nextInt();
        }

        int len=removeDuplicates(nums);

        System.out.println("Length after removing duplicates: "+len);
   

        kb.close();
    }
}
