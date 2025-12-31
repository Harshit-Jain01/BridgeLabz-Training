import java.util.Scanner;

public class LuckyDraw{
	 public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
		char c='Y';
		
		//drawing a lucky number 
		while(c=='Y'||c=='y'){
		System.out.println("Draw a number");
		int num=kb.nextInt();
		if(num%15==0){
		System.out.println("You won a gift");
		}
		else
		System.out.println("Better luck next time");
		System.out.println("Do you want to continue(Y/N)");
		c=kb.next().charAt(0);
		}
   }
}