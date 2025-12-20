import java.util.*;
class DivideChocolates{

  //creating method to find quotient and reminder

public static int[] findRemainderAndQuotient(int chocolates, int children) {
     
	 // creating int array
	 int []array=new int[2];
	 
	 //number of remaining chocolates
	 array[0]=chocolates%children;
	 
	 //find chocolates each child gets
	 array[1]=chocolates/children;
	 
	 return array;   
   }
   
   public static void main(String []args){
   
     //taking input for  numberOfchocolates and numberOfChildren.
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter chocolates");
	  int numberOfchocolates=input.nextInt();
	  System.out.println("Enter children");
	  int numberOfChildren=input.nextInt();
	 
	  //calling method
	  int []result=findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
	  
	  //display smallest and largest
	  System.out.println("chocolates each child gets "+result[1]);
	  System.out.println("number of remaining chocolates "+result[0]);
	  
	  
	  input.close();
	  
	  }
   }