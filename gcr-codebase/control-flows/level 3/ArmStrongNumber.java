import java.util.Scanner;
public class ArmStrongNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int sum=0,originalnumber=number;

	   // finding the sum of cubes of each digit
	   while(originalnumber!=0){
		int digit=originalnumber%10;
		sum+=digit*digit*digit;
	   	originalnumber/=10;
	   }
 		
	   //checking whether a number is Armstrong or not
	   if(number==sum)
	   System.out.println(number+" is Armstrong number");
	   else
	   System.out.println(number+" is not Armstrong number");

           input.close();
    }
}