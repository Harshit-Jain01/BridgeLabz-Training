import java.util.Scanner;

public class ResultGenerator{
	
	public static void main(String []args){

	Scanner kb=new Scanner(System.in);
	int []subject=new int[5];
	
	//taking subjects marks
	for(int i=0;i<5;i++){
			System.out.println("Enter subject "+(i+1)+" marks");
			subject[i]=kb.nextInt();
	}

	//calculte average
	int sum=0;
	for(int i=0;i<5;i++){
		sum+=subject[i];
	}
	double average=sum/5.0;
	int grade=(int)average/10;
	
	//assign grade
	switch(grade){
    case 10:
    case 9:
        System.out.println("Grade: A");
        break;
    case 8:
        System.out.println("Grade: B");
        break;
    case 7:
        System.out.println("Grade: C");
        break;
    case 6:
        System.out.println("Grade: D");
        break;
    default:
        System.out.println("Grade: F");
	}


	}

 }