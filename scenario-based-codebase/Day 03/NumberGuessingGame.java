import java.util.*;

class NumberGuessingGame{
	
	public static void main(String []args){
	
	Scanner kb=new Scanner(System.in);
	int c=0;
	System.out.println("Total attempts are 5");
	
	// starting game by taking input from userg
	do{
	System.out.println("enter number b/w 1 and 100");
	int num=kb.nextInt();
	int randomNum=(int)(Math.random()*98)+2;
	if(randomNum!=num)
	c++;
	if(num>randomNum)
	System.out.println("Too high");
	else 
	System.out.println("Too low");
	}while(c<5);
	
	System.out.println("Thank you for playing game");
	kb.close();
	}
}