import java.util.Scanner;
public class YoungestAndTallest{
    public static void main(String []args){
           //creating object of Scanner and taking  Amar, Akbar, and Anthony ages and heights from user
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the ages of Amar, Akbar, and Anthony ");
           int AmarAge=input.nextInt();
	   int AkbarAge=input.nextInt();
	   int AnthonyAge=input.nextInt();
	   System.out.println("Enter the heights of Amar, Akbar, and Anthony");
	   int AmarHt=input.nextInt();
	   int AkbarHt=input.nextInt();
	   int AnthonyHt=input.nextInt();

           //comparing the ages of three friends
           if(AmarAge<AkbarAge && AkbarAge<AnthonyAge )
	   System.out.println("Youngest friend is Amar");
           else if(AmarAge>AkbarAge && AkbarAge<AnthonyAge )
	   System.out.println("Youngest friend is Akbar");
	   else
	   System.out.println("Youngest friend is Anthony");

           //comparing the heights of three friends
           if(AmarHt<AkbarHt && AkbarHt>AnthonyHt )
	   System.out.println("Tallest friend is Akbar");
           else if(AmarHt>AkbarHt && AmarHt>AnthonyHt )
	   System.out.println("Tallest friend is Amar");
	   else
	   System.out.println("Tallest friend is Anthony");
      }
}
