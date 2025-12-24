import java.time.LocalDate;
import java.util.Scanner;

public class CompareDate{

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		//take user input
		System.out.println("Enter first date (yyyy-mm-dd):");
		LocalDate date1=LocalDate.parse(input.nextLine());

		System.out.println("Enter second date (yyyy-mm-dd):");
		LocalDate date2=LocalDate.parse(input.nextLine());

		if(date1.isBefore(date2)){
			System.out.println("First date is before the second date");
		}
		else if(date1.isAfter(date2)){
			System.out.println("First date is after the second date");
		}
		else if(date1.isEqual(date2)){
			System.out.println("Both dates are the same");
		}

		input.close();
	}
}
