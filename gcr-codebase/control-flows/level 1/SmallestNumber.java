import java.util.Scanner;
public class SmallestNumber{
    public static void main(String []args){
           //creating object of Scanner and taking 3 number as input from user
	   Scanner input=new Scanner(System.in);
	   String ans="";
           int number1=input.nextInt();
	   int number2=input.nextInt();
	   int number3=input.nextInt();
 
           //checking if number1 is smallest among three
	   if(number1<number2 && number1<number3)
	   ans="Yes";
	   else
	   ans="No";

	  //displaying the result
           System.out.println("Is the first number the smallest? "+ans);
       }
}


