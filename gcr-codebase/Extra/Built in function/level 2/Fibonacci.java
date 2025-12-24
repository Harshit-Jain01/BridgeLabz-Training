import java.util.*;

public class Fibonacci{

	//taking input
	public static int takeInput(){
		
		//taking input
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter number");
		int number=kb.nextInt();	
		return number;
	}
	
	// checking palindrome
	public static void  printfibonacci(int n){
		
		if(n==1)
		System.out.println(0);
		else {
		System.out.print(0+" "+1+" ");
		if(n==2)
		return;
		else{
		int a=0,b=1,c=1;
		for(int i=1;i<=n-2;i++){
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			//System.out.print(c+" ");
		   }
	    }
     }
		
		
	}
	
	
	public static void main(String[]args){
	
	// calling method
	
	int n=takeInput();
	printfibonacci(n);
	
	}
	
}