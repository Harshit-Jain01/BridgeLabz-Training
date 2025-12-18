import java.util.Scanner;
public class CheckDivisibility{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   String check="";
		
	   //checking if number is divisible by 5
	   if(number%5==0)
	   check="Yes";
	   else
	   check="No";

	   //displaying the result
	   System.out.println("Is the number "+number+" divisible by 5 "+check);
      }
}

