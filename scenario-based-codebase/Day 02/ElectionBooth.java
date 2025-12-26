import java.util.*;

public class ElectionBooth{

	public static void main(String []args){
	
		Scanner kb=new Scanner(System.in);
		
		int c=0;
		while(c!=-1){
		System.out.println("enter age");
		int age=kb.nextInt();
		
		if(age<18){
			System.out.println("Not eligible to vote");
			continue;
		}
		
		//asking for choice
		System.out.println("enter choice of candidate 1,2,3 and -1 to stop");
		c=kb.nextInt();
		int f=0,s=0,t=0;

		//checking for candidate chosen
		switch(c){
		case 1:
			System.out.println("Voted for candidate 1");
		break;
		case 2:
			System.out.println("Voted for candidate 2");
		break;
		case 3:
			System.out.println("Voted for candidate 3");
		break;
		case -1:
		break;
		default:
		System.out.println("Invalid input");
		
		}
		
		
		
		}
	
	
	}

}
