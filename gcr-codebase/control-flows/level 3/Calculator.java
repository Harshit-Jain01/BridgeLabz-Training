import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
           //creating object of Scanner and taking two number and operator as input from user
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter value of two number and operator ");
	   double first=input.nextDouble();
	   double second=input.nextDouble();
	   String op=input.next();
	   
	    // switch case for calculator
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                if (second != 0)
                    System.out.println("Result = " + (first / second));
                else
                    System.out.println("Division by zero is not allowed");
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
