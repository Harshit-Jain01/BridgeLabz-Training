import java.util.Scanner;

public class RandomNumber{

    // generate 4Digit Random Array
	public int[] generate4DigitRandomArray(int size){
	
	int []arr=new int[size];
	for(int i=0;i<size;i++){
	arr[i]=(int)(Math.random()*9000)+1000;
	}
	return arr;
	}
	
	// find average, min and max value of an array 
	public double[] findAverageMinMax(int[] numbers) 
	{	
		double[]arr=new double[3];
		double sum=0;
		int min=999999,max=0;
		for(int i=0;i<numbers.length;i++){
		sum+=numbers[i];
		max=Math.max(max,numbers[i]);
		min=Math.min(min,numbers[i]);
		}
		
		arr[0]=sum/numbers.length;
		arr[1]=min;
		arr[2]=max;
		return arr;
	}
	
	public static void main(String[] args) {
	
	//creting object of class and calling method
	RandomNumber nc=new RandomNumber();
	int []arr=nc.generate4DigitRandomArray(5);
	
	//displaying numbers
	System.out.println("Numbers are");
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	
	//find average, min and max 
	double []brr=nc.findAverageMinMax(arr);
	System.out.println("avg "+brr[0]);
	System.out.println("min "+brr[1]);
	System.out.println("max "+brr[2]);
	
	}
}
	
	
	
