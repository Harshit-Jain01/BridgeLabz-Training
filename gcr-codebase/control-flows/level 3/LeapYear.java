import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        //creating object of Scanner and taking year from user
           Scanner input=new Scanner(System.in);
           int year=input.nextInt();

	// checking and displaying whether a year is Leap year or not
	   if(year<1582)
	   System.out.println("Not a valid year");
	   else if(year%400==0)
	   System.out.println("It is a leap year");
	   else if(year%100==0)
	   System.out.println("It is not a leap year");
	   else if(year%4==0)
           System.out.println("It is a leap year");
	   else
	   System.out.println("It is not a leap year");

           input.close();
      }
}
