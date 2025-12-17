import java.util.Scanner;
class DoubleOperation{
     public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking three numbers input in a,b,c
	double a=kb.nextDouble();
	double b=kb.nextDouble();
	double c=kb.nextDouble();

	// performing operations
	double firstOperation=a + b *c;
	double  secondOperation=a * b + c;
	double  thirdOperation=c + a / b;
	double  fourthOperation= a % b + c;

	//displaying result of operations
	System.out.println(" The results of double Operations are "+firstOperation+","+secondOperation+","+thirdOperation+" and "+fourthOperation);
     }
}
