import java.util.Scanner;
public class CountingDigits{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int count=0;

	   // finding count of digit in number
	   while(number!=0){
		count++;
	   	number/=10;
	   }

	  //displaying the count of digits
	  System.out.println("Total number of digits "+count);

	  input.close();
     }
}
