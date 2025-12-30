import java.util.Scanner;

class FitnessTracker{
    public static void main(String[] args){
	
        Scanner kb=new Scanner(System.in);
		int []day=new int[7];
		
		//taking number of pushups
		for(int i=0;i<7;i++){
		System.out.println("Enter number of push-ups for day "+(i+1));
		day[i]=kb.nextInt();
		}
		
		int count=0;
		
		//counting total pushup and finding average
		for(int c:day){
		if(c==0)
		continue;
		else
		count+=c;
		}
		
		System.out.println("Total push-ups "+count);
		System.out.println("Average "+count/7);
		
		}
		
	}