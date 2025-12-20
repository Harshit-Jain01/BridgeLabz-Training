import java.util.*;
public class LeapYear{
     public boolean checkLeapYear(int year){
	 
	 //check leap year
	 if(year%400==0)
	 return true;
	 else if(year%100==0)
	 return false;
	 else if(year%4==0)
	 return true;
	 return false;
	 
	 }
	 
	  public static void main(String []args){
   
     //taking input for year
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter year");
	 int year=input.nextInt();
	 
	 //creating object of class
	 LeapYear lp=new LeapYear();
	 boolean result=lp.checkLeapYear(year);
	 
	 if(result)
	 System.out.println("It is leap year");
	 else
	  System.out.println("not a leap year");
	  
	  input.close();
	  
	  }
}
	 
