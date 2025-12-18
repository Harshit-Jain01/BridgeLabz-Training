import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String []args){
           //creating object of Scanner and taking salary and year of service from user
	   Scanner input=new Scanner(System.in);
           double salary=input.nextDouble();
           int year=input.nextInt();
	   double bonus=0;

           //finding the bonuses of employees based on their years of service
           if(year>5)
           bonus=(salary*5)/100;

           //displaying the bonus amount
           System.out.println("Bonus amount is "+bonus);
      }
}
           

