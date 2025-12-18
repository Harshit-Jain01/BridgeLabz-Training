import java.util.Scanner;
public class SumOfNumber{
    public static void main(String []args){
           //creating object of Scanner and initialising total variable
	   Scanner input=new Scanner(System.in);
	   double total=0.0;
           double number=input.nextDouble();

	   //Applying the  while loop until user enters 0
	   while(number!=0){
	   total+=number;
	   number=input.nextDouble();
           }
 
           //Displaying result
           System.out.println("The total value is "+total);
     }
}
