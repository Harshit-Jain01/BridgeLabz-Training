import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryFine{

    public static void main(String[] args){
	
        Scanner sc=new Scanner(System.in);
        int fineRate=5;

        //loop for 5 books
        for(int b=1;b<=5;b++){
            System.out.println("\nBook "+b);

            System.out.print("Enter due date(yyyy-mm-dd): ");
            LocalDate d=LocalDate.parse(sc.next());

            System.out.print("Enter return date(yyyy-mm-dd): ");
            LocalDate r=LocalDate.parse(sc.next());

            long late=ChronoUnit.DAYS.between(d,r);

            if(late>0){
                long fine=late*fineRate;
                System.out.println("Late by "+late+" days");
                System.out.println("Fine:Rs"+fine);
            }else{
                System.out.println("Returned on time. No fine");
            }
        }
        sc.close();
    }
}
