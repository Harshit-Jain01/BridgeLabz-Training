import java.util.Scanner;

public class GcdLcm{

	// calculate GCD 
	public static int gcd(int a,int b){
		while(b!=0){
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

	// calculate LCM
	public static int lcm(int a,int b){
		return (a*b)/gcd(a,b);
	}

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		System.out.println("Enter first number");
		int num1=input.nextInt();
		System.out.println("Enter second number");
		int num2=input.nextInt();

		int gcdValue=gcd(num1,num2);
		int lcmValue=lcm(num1,num2);

		System.out.println("GCD= "+gcdValue);
		System.out.println("LCM= "+lcmValue);

		input.close();
	}
}
