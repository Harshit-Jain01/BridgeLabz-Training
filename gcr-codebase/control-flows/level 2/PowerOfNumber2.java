import java.util.Scanner;
public class PowerOfNumber2{
    public static void main(String[] args) {
        //creating object of Scanner and taking number and power from user
           Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int power=input.nextInt();
	   
	if(number<1)
	System.out.println("Not a positive Number");
	else{
        //calculating the power
	int result=1;
	for(int i=1;i<=power;i++){
	result*=number;
	}
	//displaying the result
	System.out.println("The power of number is "+result);
	}
	input.close();
    }
}

	  
