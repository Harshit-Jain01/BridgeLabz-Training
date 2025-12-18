import java.util.Scanner;
public class HarshadNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
	   Scanner input=new Scanner(System.in);
	   int number=input.nextInt();
	   int sum=0,temp=number;
	   
	   //finding the sum of digits
	   while(temp!=0){
	   int digit=temp%10;
	   sum+=digit;
	   temp/=10;
	   }

	  //checking if number is harshad number or not
	  if(number%sum==0)
	  System.out.println(number+" is a Harshad Number");
	  else 
	  System.out.println(number+" is not a Harshad Number");
    }
}
		
