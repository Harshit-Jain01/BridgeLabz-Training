import java.util.Scanner;

public class CurrencyExchange{

    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
		char c='Y';
		double con=0;
		int choice;
		do{
			
			//taking input amount to convert
		System.out.println("Enter amount in rupees");
		int rupees=kb.nextInt();
		System.out.println("Select currency\n1.Us Dollar\n2.Euro\n3.Pound\n4.Exit");
		choice=kb.nextInt();
		
		
		// differnt currency convertor and displaying result
		switch(choice){
		case 1:
		 con=rupees/90.0;
		System.out.println(rupees+" Rs in dollar is "+con);
		break;
		case 2:
	    con=rupees/105;
		System.out.println(rupees+"in Euro is "+con);
		break;
		case 3:
	    con=rupees/121;
		System.out.println(rupees+" Rs in Pound is "+con);
		break;
		case 4:
		System.out.println("Thank you");
		break;
		default:
		System.out.println("Wrong choice!");
		}
		System.out.println("Do you want to again exchange currency(Y/N)");
		c=kb.next().charAt(0);
		}while(c=='Y' && choice!=4);
		
	}	
}