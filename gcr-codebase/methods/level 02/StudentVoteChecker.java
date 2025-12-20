import java.util.*;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
	
	//checking eligibility of voting
	if(age<=0 || age<18)
	return false;
	return true;
	}
	
	 public static void main(String[] args) {
	 
	 Scanner input=new Scanner(System.in);
	 //creting an array 
	 int []arr=new int[10];
	 
	 //taking age
	 System.out.println("enter age of 10 Studemts");
	 for(int i=0;i<10;i++)
	 arr[i]=input.nextInt();
	 
	 // creating object of class and calling method
	 StudentVoteChecker vote=new StudentVoteChecker();
	 
	 for(int i=0;i<10;i++){
	 boolean result=vote.canStudentVote(arr[i]);
	 System.out.print("Age of "+arr[i]);
	 System.out.println(result?" can vote":" cannot vote");
	 }
	 
	 input.close();
	  
	  }
}