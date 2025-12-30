import java.util.*;

public class TemperatureLogger{
	public static void main(String []args){
		
		Scanner kb=new Scanner(System.in);
		String []day={"Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};
		double []temp=new double[7];
		
		double sum=0;
		double max=-1000;
		int index=0;
		for(int i=0;i<7;i++){
		
		//asking for temperature
		System.out.println("Enter temp for "+day[i]);
		temp[i]=kb.nextDouble();
		sum+=temp[i];
		
		//finding maximum temperature
		if(temp[i]>max){
		max=temp[i];
		index=i;
		}	
		}
		
		//displaying temp
		for(int i=0;i<7;i++){
		System.out.println(day[i]+" temp is "+temp[i]);
		}
		
		System.out.println("Average temp is "+sum/7.0);
		System.out.println("Maximum temp is on "+day[index]+":"+max);
		
	
	
	}

}