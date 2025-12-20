import java.util.Scanner;

public class Quadratic{
     
	 // finding roots
	 public static double [] rootsOfEquation(int a,int b,int c){
			
			double []arr;
			double delta = b*b-4*a*c;
			if(delta<0)return new double[0];
			else if(delta>0){
			 arr=new double[2];
			 arr[0]= (-b + Math.sqrt(delta))/(2*a); 
			  arr[1]= (-b - Math.sqrt(delta))/(2*a); 
			}
			else{
			arr=new double[1];
			arr[0]=-b/(2.0*a);
			}
			return arr;
		
	 }
	 public static void main(String[] args){
	 
	 //Take a, b, and c as input values
		Scanner kb=new Scanner(System.in);
	   int a=kb.nextInt();
	   int b=kb.nextInt();
	   int c=kb.nextInt();
	   
	   //calling method
	   double []arr=rootsOfEquation(a,b,c);
	   
	   //displaying roots
	   for(int i=0;i<arr.length;i++)
	   System.out.println(arr[i]);
	   
	   kb.close();
	   
	   }
	}
