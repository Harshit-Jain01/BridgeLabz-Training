import java.util.*;

public class Factorial{

	//taking input
	public static int takeInput(){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter number");
		int num=kb.nextInt();
		
		return num;
	}
	
	// to generate the factorial
	public static int factorial(int n){
		
		if(n==0 || n==1)
		return 1;
		return n*factorial(n-1);
	}
	
	//displaying maximum number
	public static void display(int n){	
		System.out.println("Factorial is "+n);
	}

	public static void main(String[]args){
	
		// calling method
		int n=takeInput();
		int ans=factorial(n);
		display(ans);
	}
	
}