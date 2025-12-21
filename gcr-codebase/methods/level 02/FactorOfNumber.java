import java.util.*;
 class FactorOfNumber{
 
    //find the factors
	 public static int[] findFactor(int number){
			int count=0,idx=0;
			for(int i=1;i<=number;i++){
		     if(number % i==0){
			   count++;
			  }
		   }
		   int factor[] = new int[count];
		  for(int i=1;i<=number;i++){
		     if(number % i==0)
			   factor[idx++]=i;
		  }
		 return factor;
	  }
	  
	  // sum of the factors 
	  public static double sumOfFactors(int ans[]){
		  int sum=0;
		  for(int i=0;i<ans.length;i++){
		    sum+=ans[i];
		  }
		return sum;
		  
	  }
	  
	  //the product of the factors
	    public static double productOfFactors(int ans[]){
		  int product=1;
		  for(int i=0;i<ans.length;i++){
		    product*=ans[i];
		  }
		return product;
		  
	  }
	  
	  //sum of square of factors 
       public static double sumOfSquareOfFactors(int arr[]){
		  int sum=0;
		  for(int i=0;i<arr.length;i++){
		    sum+=Math.pow(arr[i],2);
		  }
		return sum;
		  
	  }
	  
	    
    public static void main(String []args){
	
      Scanner input = new Scanner(System.in);
	  
	  //taking number as input 
	    System.out.println("Enter the number : ");
	    int number = input.nextInt();
		
	 //calling the methods
	   int res[]=findFactor(number); 
	   double res1=sumOfFactors(res);
	   double res2=productOfFactors(res);
	   double res3=sumOfSquareOfFactors(res);
	   
	   
	   //display result 
		System.out.print("Factors of the number is :");
		for(int i=0;i<res.length;i++){
		  System.out.print( res[i]+",");
		}
                System.out.println();
		System.out.print("Sum of the factors of the number is :" +res1);
                System.out.println();
		System.out.print("product of the factors of the number is :" +res2);
                System.out.println();
		System.out.print("sum of the square of the factors of the number is :" +res3);
	    
		input.close();

        }	

   }