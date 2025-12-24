import java.util.Scanner;

public class Calculator {

	// addition
	public static double add(double a,double b){
		return a+b;
	}

	// subtraction
	public static double subtract(double a,double b){
		return a-b;
	}

	// multiplication
	public static double multiply(double a,double b){
		return a*b;
	}

	// division
	public static double divide(double a,double b){
		if(b==0){
			System.out.println("Division by zero not allowed");
			return 0;
		}
		return a/b;
	}

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		// taking numbers
		System.out.println("Enter first number");
		double first=input.nextDouble();

		System.out.println("Enter second number");
		double second=input.nextDouble();

		// choosing operation
		System.out.println("Choose operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int choice=input.nextInt();
		double result=0;

		switch(choice){
			case 1:
				result=add(first,second);
				break;
			case 2:
				result=subtract(first,second);
				break;
			case 3:
				result=multiply(first,second);
				break;
			case 4:
				result=divide(first,second);
				break;
			default:
				System.out.println("Invalid choice");
				input.close();
				return;
		}

		System.out.println("Result= "+result);
		input.close();
	}
}
