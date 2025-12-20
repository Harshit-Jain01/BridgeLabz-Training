import java.util.*;
class Trignometry{

    //creating method to find  various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle){
	
	//convert degree in radian
	double radian=Math.toRadians(angle);
	
	//creating array and store sine, cosine and tangent.
    double []array=new double[3];
	array[0]=Math.sin(radian);
	array[1]=Math.cos(radian);
	array[2]=Math.tan(radian);
	
	 return array;   
   }
   
   public static void main(String []args){
   
     //taking input for angle in degree
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter angle in degree");
	  double angle=input.nextDouble();
	  
	 
	  //creating object and calling method
	  Trignometry obj=new Trignometry();
	  double []result=obj.calculateTrigonometricFunctions(angle);
	  
	  //display various trigonometric functions
	  System.out.println("sin "+result[0]);
	  System.out.println("cosine "+result[1]);
	  System.out.println("tangent"+result[2]);
	  
	  input.close();
	  
	  }
   }