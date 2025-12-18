import java.util.Scanner;
public class LeapYear2{
    public static void main(String[] args) {

        //creating object of Scanner and taking year as input from user
           Scanner input=new Scanner(System.in);
           int year=input.nextInt();

	//checking whether year is leapyear or not
	if(year>=1582 &&(year%400==0 ||(year%4==0 && year%100!=0)))
	System.out.println("It is a Leap Year");
        else if(year>=1582)
        System.out.println("It is not a Leap Year");
        else
	System.out.println("Not a valid Year");

	 input.close();
     }
}