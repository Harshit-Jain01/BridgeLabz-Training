import java.util.Scanner;
public class  SpringSeason{
    public static void main(String []args){
           //taking  month and day as input from user using command line argument
	   int month=Integer.parseInt(args[0]);
           int day=Integer.parseInt(args[1]);

           // checking if day and month belong to Spring Season 
           if(day<=0 ||month<3 || month>6 || (month==3 && (day<20 || day>31) ) || (month==6 && day>20) ||(month==4 && day>30)||(month==5 && day>31))
	   System.out.println("Not a Spring Season");
	   else
	   System.out.println("It's a Spring Season");
        }   
}	  
