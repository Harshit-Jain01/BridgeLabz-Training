import java.util.Scanner;

public class NumberGuess{

	// taking user input
	public static int userInput(){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number");
		return kb.nextInt();
	}

	// generating random number
	public static int generateRandom(){
		
		int num=(int)(Math.random()*98)+2;
		System.out.println("random number "+num);
		return num;
	}

	
	// guessing the output
	public static void guessing(int n1,int n2){
		if(n2>n1)
		System.out.println("Guess is low");
		else if(n1>n2)
		System.out.println("Guess is high");
		else
		System.out.println("Guess is correct");
		
	}
	

	public static void main(String[] args){

		//calling method
		
		int n1=userInput();
		int n2=generateRandom();
		guessing(n1,n2);
			
	}
}
