import java.util.Scanner;
public class SumOfNaturalNumber{
    public static void main(String []args){
           //creating object of Scanner and taking  number as input from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
           
	  //checking if number is natural number or not if yes then finding sum 
          if(number<0)
	  System.out.println("The number"+number+" is not a natural number");
          else
	  System.out.println("The sum of "+number+"natural numbers is "+(number * (number+1) / 2));
      }
}
          
          
	   