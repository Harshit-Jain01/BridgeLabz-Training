import java.util.Scanner;
public class CheckingNumber{
    public static void main(String []args){
           //creating object of Scanner and taking  number as input from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();

          //checking whether a number is positive, negative, or zero
	  if(number>0)
	  System.out.println("Positive");
          else if(number<0)
          System.out.println("Negative"); 
	  else
	  System.out.println("Zero");
      }
} 	
