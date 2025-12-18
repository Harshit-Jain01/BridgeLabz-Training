import java.util.Scanner;
public class AbundantNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
	   Scanner input=new Scanner(System.in);
	   int number=input.nextInt();
	   int sum=0;
	   
	   //finding the sum of divisors
	   for(int i=1;i<number;i++){
		if(number%i==0)
	        sum+=i;
	   }

	  //checking if number is Abundant number or not
	  if(sum>number)
	  System.out.println(number+" is an Abundant Number");
	  else 
	  System.out.println(number+" is not an Abundant Number");

	  input.close();
    }
}
		
