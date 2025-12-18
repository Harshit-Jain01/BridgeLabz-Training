import java.util.Scanner;
public class TableOfNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();

           //displaying the table from 6 to 9
           for(int i=6;i<=9;i++)
           System.out.println(number+"*"+i+"="+(number*i));
     }
}