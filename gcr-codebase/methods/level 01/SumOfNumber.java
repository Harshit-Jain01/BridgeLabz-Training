import java.util.*;
class SumOfNumber{

  //creating method to find sum of number 
   public  int sumOfnumber(int number){
      int sum=0;
	  for(int i=1;i<=number;i++)
	  sum+=i;
	  return sum;
      
   }
   
   public static void main(String []args){
   
     //taking input for month and day
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter number");
	  int number=input.nextInt();
	  
	  //creating object of class and calling method
	  SumOfNumber object=new SumOfNumber();
	  int result=object.sumOfnumber(number);
	  
	  //display sum
	  System.out.println("Sum of natural number is "+result);
	  
	  
	  input.close();
	  
	  }
   }