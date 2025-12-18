import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args) {
        //creating object of Scanner and taking number and power from user
           Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int power=input.nextInt();
	   int result=1,counter=0;

        //calculating the power
	while(counter!=power){
	result*=number;
	counter++;
	}

	//displaying the result
	System.out.println("The power of number is "+result);

	input.close();
    }
}

	  
