import java.util.Scanner;

class SumOfSquares{

    public static int sumOfSquares(int[] nums) {
        int n=nums.length,s=0;
        for(int i=1;i<=nums.length;i++){
            if(n%i==0)
                s+=(nums[i-1]*nums[i-1]);
        }
        return s;
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
		
		System.out.print("sum of the squares of all special elements ");
        System.out.print(sumOfSquares(nums));
        input.close();
    }
}
