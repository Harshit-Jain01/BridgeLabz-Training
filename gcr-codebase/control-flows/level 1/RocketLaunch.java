import java.util.Scanner;
public class RocketLaunch{
    public static void main(String []args){
           //creating object of Scanner and taking countdown number as input from user
	   Scanner input=new Scanner(System.in);
           int counter=input.nextInt();

	  // using while loop to countdown till 1
          while(counter!=0){
	  System.out.println(counter--);
        }
    }
}     