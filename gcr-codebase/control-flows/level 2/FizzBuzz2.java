import java.util.Scanner;
public class FizzBuzz2{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();

	   if(number<=0)
	   System.out.println("Not a natural number");
	   else
	   {
	   //applying while loop and checking condition
           int i=1;
	   while(i<=number){
           if(i%3==0 && i%5==0)
	   System.out.println("FizzBuzz");
	   else if(i%3==0)
           System.out.println("Fizz");
           else if(i%5==0)
           System.out.println("Buzz");
           else
           System.out.println(i);
	   i++;
            }
	}
    }
}
	