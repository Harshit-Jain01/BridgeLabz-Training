import java.util.*;
public class DayOfWeek{
   public static void main(String []args){

	//taking input for day, month, and year using command line arguments

	int m=Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]);
	

	//applying formula
	int y0=y-(14-m)/12;
	int x=y0+y0/4-y0/100+y0/400;
	int month=m+12*((14-m)/12)-2;
	int dw=(d+x+31*month/12)%7;


	//appying operations and displaying the result 
	if(dw==0)
		System.out.println("Sunday");
	else if(dw==1)
		System.out.println("Monday");
	else if(dw==2)
		System.out.println("Tuesday");
	else if(dw==3)
		System.out.println("Wednesday");
	else if(dw==4)
		System.out.println("Thursday");
	else if(dw==5)
		System.out.println("Friday");
	else if(dw==6)
		System.out.println("Saturday");


   }
}

	