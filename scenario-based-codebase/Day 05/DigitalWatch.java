import java.util.*;

public class DigitalWatch{

	public static void main(String []args){
	
	 System.out.println("Digital Watch 24 hours");
	
	//for hours
	for(int i=0;i<24;i++){
		//for minutes
		for(int j=0;j<=59;j++){
			if(i==13 && j==0){
		   System.out.println("Power cut");
			break;
			}
			 System.out.println("Hr:"+i+" Min:"+j);
		}	
	
	}
	
	}


}