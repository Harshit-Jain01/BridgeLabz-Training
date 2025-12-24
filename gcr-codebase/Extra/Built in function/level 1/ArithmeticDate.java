import java.time.LocalDate;
import java.util.Scanner;

public class ArithmeticDate{

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		// taking date input
		System.out.println("Enter date (yyyy-mm-dd):");
		String d=input.nextLine();

		LocalDate date=LocalDate.parse(d);

		// adding 7 days, 1 month, and 2 years
		LocalDate ud=date.plusDays(7).plusMonths(1).plusYears(2);

		// subtracting 3 weeks
		LocalDate fd=ud.minusWeeks(3);

		System.out.println("Original Date: "+date);
		System.out.println("After adding 7 days, 1 month, and 2 years: "+ud);
		System.out.println("After subtracting 3 weeks: "+fd);

		input.close();
	}
}
