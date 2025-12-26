import java.util.*;

public class MetroFareDeduction{

	public static void main(String []args){
	
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter balance");
		int balance=kb.nextInt();
		
		// asking for distance and deducing balance
		while(balance>0){
			System.out.println("Enter distance or type quit for exit");
			String choice=kb.next();
			if(choice.equalsIgnoreCase("quit"))
			break;
			int dis=Integer.parseInt(choice);
			int rem;
			rem=(dis<=10)?dis*20:dis*15;
			balance-=rem;
			System.out.println("Your balance is "+balance);
		}
		
		kb.close();
	
	}

}
