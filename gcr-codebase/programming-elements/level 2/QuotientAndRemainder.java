import java.util.Scanner;
public class QuotientAndRemainder{
    public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking two numbers input in number1 and number2
	int number1=kb.nextInt();
	int number2=kb.nextInt();
	
	// finding  quotient and reminder
	double  quotient=(double)number1/number2;
	int remainder=number1%number2;
	
	//dispalying quotient and reminder
	System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);
    }
}