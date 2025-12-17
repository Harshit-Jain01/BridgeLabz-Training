import java.util.Scanner;
class IntOperation{
     public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking three numbers input in a,b,c
	int a=kb.nextInt();
	int b=kb.nextInt();
	int c=kb.nextInt();

	// performing operations
	int firstOperation=a + b *c;
	int secondOperation=a * b + c;
	int thirdOperation=c + a / b;
	int fourthOperation= a % b + c;

	//displaying result of operations
	System.out.println(" The results of Int Operations are "+firstOperation+","+secondOperation+","+thirdOperation+" and "+fourthOperation);
     }
}



