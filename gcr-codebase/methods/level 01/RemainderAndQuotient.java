import java.util.*;
class RemainderAndQuotient{

  //creating method to find quotient and reminder

public static int[] findRemainderAndQuotient(int number, int divisor) {
     
	 // creating int array
	 int []array=new int[2];
	 
	 //find reminder
	 array[0]=number%divisor;
	 
	 //find quotient
	 array[1]=number/divisor;
	 
	 return array;   
   }
   
   public static void main(String []args){
   
     //taking input for  numebr
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter number");
	  int number=input.nextInt();
	  System.out.println("Enter divisor");
	  int divisor=input.nextInt();
	 
	  //calling method
	  int []result=findRemainderAndQuotient(number,divisor);
	  
	  //display smallest and largest
	  System.out.println("quotient is "+result[1]);
	  System.out.println("remainder is "+result[0]);
	  
	  
	  input.close();
	  
	  }
   }