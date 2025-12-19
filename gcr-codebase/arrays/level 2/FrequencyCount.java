import java.util.*;

public class FrequencyCount{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    //taking number by the user and creating frequency array
		int number=input.nextInt();
		int []frequency=new int[10];
		
		//counting the number of digits in number
		while(number!=0)
		{
			int digit=number%10;
			frequency[digit]++;
			number/=10;
		}
		
		//displaying the frequency of digits
			for(int i=0;i<10;i++){
				if(frequency[i]!=0)
				System.out.println(i+"-"+frequency[i]);
			}	
		
    }
}