import java.util.Scanner;

class CheckNumber{
   public static void main(String[] args) {

      // Create a Scanner Object and  creating an integer array of 5 numbers
      Scanner input = new Scanner(System.in);
      int []number=new int[5];
     

      //taking number as input 
      for(int i=0;i<number.length;i++){
	System.out.println("Enter a number:");
      	number[i]=input.nextInt();
      }
      

      //checking if number is positive,negative or zero
      for(int i=0;i<number.length;i++){
      	if(number[i]<0)
	   System.out.println(number[i]+" is negative");
	else if(number[i]>0){
		if(number[i]%2==0)
		   System.out.println(number[i]+" is even");
		else
		   System.out.println(number[i]+" is odd");
	}
	else
	   System.out.println("zero");

      }
      

      //comparing first and last element
	if(number[0]>number[4])
	     System.out.println("first element is greater than last element");
	else if(number[0]<number[4])
	      System.out.println("first element is less than last element");
	else
 	       System.out.println("first element is equal to last element");


	input.close();
	System.exit(0);

      }
} 
