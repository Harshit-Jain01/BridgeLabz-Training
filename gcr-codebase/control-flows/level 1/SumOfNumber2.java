import java.util.Scanner;
public class SumOfNumber2{
    public static void main(String []args){
           //creating object of Scanner and initialising total variable
	   Scanner input=new Scanner(System.in);
	   double total=0.0;
           double number;

	   //Applying the  while loop until user enters 0
	   while(true){
	   number=input.nextDouble();
	   total+=number;
	   if(number<=0)
	   break;
           }
 
           //Displaying result
           System.out.println("The total value is "+total);
     }
}
