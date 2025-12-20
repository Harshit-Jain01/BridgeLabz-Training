import java.util.*;
class CheckNumber{

  //creating method to find whether a number is positive, negative, or zero. 
   public  int checkNumber(int number ){
     if(number<0)
	 return -1;
	 else if(number>0)
     return 1;
	 return 0;
   }
   
   public static void main(String []args){
   
     //taking input for number 
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter number");
	  int number=input.nextInt();
	  
	  //creating object of class and calling method
	  CheckNumber object=new CheckNumber();
	  int result=object.checkNumber(number);
	  
	  //display result
	  if(result==1)
	  System.out.println("number is positive");
	  else if(result==-1)
	  System.out.println("number is negative");
	  else
	  System.out.println("number is zero");
	  
	  input.close();
	  
	  }
   }
	  