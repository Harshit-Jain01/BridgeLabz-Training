import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate{

	public static void main(String[] args) {

		LocalDate ld=LocalDate.now();
		
		//calling method
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		//display result
		System.out.println("Format dd/MM/yyyy : "+ld.format(format1));
		System.out.println("Format yyyy-MM-dd : "+ld.format(format2));
		System.out.println("Format EEE, MMM dd, yyyy : "+ld.format(format3));
	}
}
