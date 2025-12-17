import java.util.Scanner;
class Calculator{
    public static void main(String []args){
	  // creating Scanner object and taking num1 and num2 from user
	  Scanner kb = new Scanner(System.in);
	  float number1=kb.nextFloat();
	  float  number2=kb.nextFloat();

	  //Performing Arithmetic Operations of addition, subtraction, multiplication and division
	  float add=number1+number2;
	  float subtract=number1-number2;
	  float product=number1*number2;
	  double div=number1/number2;
	
	  //Diplaying the result
	  System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+subtract+", "+product+","+div);
    }
}

	  

	
	