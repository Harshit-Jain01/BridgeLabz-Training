import java.util.*;

public class PrimeNumber{

	//taking input
	public static int takeInput(){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter number");
		int num=kb.nextInt();
		
		return num;
	}
	
	// to check prime number
	public static boolean isPrime(int n){
		
		if(n<=1)
		return false;
		else if(n==2)
		return true;
		else if(n%2==0)
		return false;
		for(int i=3;i*i<=n;i+=2){
		if(n%i==0)
		return false;
		}
		return true;
	}
	
	//displaying maximum number
	public static void display(boolean f){	
		System.out.println(f?"It is prime":"It is not prime");
	}

	public static void main(String[]args){
	
	// calling method
	
	int n=takeInput();
	boolean flag=isPrime(n);
	display(flag);
	}
	
}