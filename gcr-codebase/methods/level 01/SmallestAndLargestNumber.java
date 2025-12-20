import java.util.*;
class SmallestAndLargestNumber{

  //creating method to find smallest and largest of the three numbers

  public static int[] findSmallestAndLargest(int number1, int number2, int number3){
     
	 // creating int array
	 int []array=new int[2];
	 
	 //find Smallest 
	 if(number1<number2 && number1<number3)
	 array[0]=number1;
	 else if(number1>number2 && number2<number3)
	 array[0]=number2;
	 else
	 array[0]=number3;
	 
	 //finding largest
	 if(number1>number2 && number1>number3)
	 array[1]=number1;
	 else if(number1<number2 && number2>number3)
	 array[1]=number2;
	 else
	 array[1]=number3;
	 
	 return array;
	 
      
   }
   
   public static void main(String []args){
   
     //taking input for three numebr
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter 1st number");
	  int number1=input.nextInt();
	  System.out.println("Enter 2nd number");
	  int number2=input.nextInt();
	  System.out.println("Enter 3rd number");
	  int number3=input.nextInt();
	  
	  //calling method
	  int []result=findSmallestAndLargest(number1,number2,number3);
	  
	  //display smallest and largest
	  System.out.println("Smallest number is "+result[0]);
	  System.out.println("Largest number is "+result[1]);
	  
	  
	  input.close();
	  
	  }
   }