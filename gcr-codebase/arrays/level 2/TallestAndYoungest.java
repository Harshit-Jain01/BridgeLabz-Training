import java.util.*;

public class TallestAndYoungest{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	 //creating integer array of age and height
		int []age=new int[3];
		int []height=new int[3];
		
	//taking age of Amar, Akbar, and Anthony 
		System.out.println("Enter the age");
		for(int i=0;i<3;i++){
		  age[i]=input.nextInt();
		}
		
	//taking height of Amar, Akbar, and Anthony 
		System.out.println("Enter the height");
		for(int i=0;i<3;i++){
		  height[i]=input.nextInt();
		}
		
	//finding the youngest 
		if(age[0]<age[1] && age[0]<age[2])
		  System.out.println("Youngest is Amar");
		else if(age[0]>age[1] && age[1]<age[2])
		  System.out.println("Youngest is Akbar");
		else 
		  System.out.println("Youngest is Anthony");
		
	//finding the tallest 
		if(height[0]>height[1] && height[0]>height[2])
		   System.out.println("Tallest is Amar");
		else if(height[0]<height[1] && height[1]>height[2])
		   System.out.println("Tallest is Akbar");
		else 
		   System.out.println("Tallest is Anthony");
		
		input.close();
		
	}
}