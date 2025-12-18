import java.util.Scanner;
public class ComparingSum{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
           
          //checking if a number is natural or not, if it is then comparing its sum with formula and while loop and disp
	  if(number<=0)
          System.out.println(number+" is not a natural number");
          else{
	  int totalbyFormula=number*(number+1)/2;
	  int total=0;
          while(number!=0){
	  total+=(number--);
          }
	  
          //comparing and displaying the result
	  System.out.println("Total sum by formula "+totalbyFormula);
          System.out.println("Total sum using while loop "+totalbyFormula);
              }
       }
}