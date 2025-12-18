import java.util.Scanner;
public class RocketLaunch2{
    public static void main(String []args){
           //creating object of Scanner and taking countdown number as input from user
	   Scanner input=new Scanner(System.in);
           int counter=input.nextInt();

	  // using for loop to countdown till 1
          for(int i=counter;i>0;i--){
	  System.out.println(i);
        }
    }
}     