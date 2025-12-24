import java.util.*;

public class MaximumNumber{

	//taking input
	public static int []takeInput(){
		
		//taking input
		Scanner kb=new Scanner(System.in);
		int []arr=new int[3];
		System.out.println("Enter 3 numbers");
		arr[0]=kb.nextInt();
		arr[1]=kb.nextInt();
		arr[2]=kb.nextInt();
		
		return arr;
	}
	
	// finding the maximum of three number
	public static int maximumNumber(int []arr){
		
		int max=Math.max(arr[0],Math.max(arr[1],arr[2]));
		
		return max;
	}
	
	//displaying maximum number
	public static void display(int n){	
		System.out.println("Maximum number is "+n);
	}

	public static void main(String[]args){
	
	// calling method
	
	int []arr=takeInput();
	int n=maximumNumber(arr);
	display(n);
	}
	
}