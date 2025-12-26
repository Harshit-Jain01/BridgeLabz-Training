import java.util.Arrays;
import java.util.Scanner;

class HeightChecker{ 
	
	// for finding the mismatch of height
    public int heightChecker(int[] heights) {
        int []arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]) c++;
        }
        return c;
    }

    // main method
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		
        System.out.println("Enter number of students:");
        int n=input.nextInt();

        int[] heights=new int[n];
        System.out.println("Enter heights:");
        for(int i=0;i<n;i++){
            heights[i]=input.nextInt();
        }
		
		//calling method and displaying result
        HeightChecker obj=new HeightChecker();
        int result=obj.heightChecker(heights);

        System.out.println("Students not in correct order: "+result);

        input.close();
    }
}
