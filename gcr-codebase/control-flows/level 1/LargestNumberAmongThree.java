import java.util.Scanner;
public class LargestNumberAmongThree{
    public static void main(String []args){
           //creating object of Scanner and taking 3 number as input from user
	   Scanner input=new Scanner(System.in);
	   String ans1="",ans2="",ans3="";
           int number1=input.nextInt();
	   int number2=input.nextInt();
	   int number3=input.nextInt();

	   // checking if the first, second, or third number is the largest of the three
	   if(number1>number2 && number1>number2)
	   ans1="Yes";
	   else
           ans1="No";
	   if(number1<number2 && number3<number2)
	   ans2="Yes";
	   else
           ans2="No";
           if(number3>number1 && number3>number2)
	   ans3="Yes";
	   else
           ans3="No";
     
           //displaying the result of number among which is largest
           System.out.println("Is the first number the largest? "+ans1);
           System.out.println("Is the second number the largest? "+ans2);
           System.out.println("Is the third number the largest? "+ans3);
        }
}