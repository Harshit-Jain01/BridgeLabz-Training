import java.util.Scanner;

class Convert2DTo1DArray{
   public static void main(String[] args) {

      // Create a Scanner Object and taking row and column from user and making 2-D Array
      Scanner input = new Scanner(System.in);
      System.out.println("enter row and column");
      int row=input.nextInt();
      int column=input.nextInt();
      int [][]arr=new int[row][column];

      
      //taking input in 2D Array
      for(int i=0;i<row;i++){
	  for(int j=0;j<column;j++){
		System.out.println("enter number");
                arr[i][j]=input.nextInt();
	   }
       }

	
     //converting 2D to 1D array
	int index=0;
	int array[]=new int[row*column];
	 for(int i=0;i<row;i++){
	    for(int j=0;j<column;j++){
                array[index++]=arr[i][j];
	    }
         }
	

     //displaying 1D Array
	System.out.println("One-Dimensional Array");
	for(int i=0;i<row*column;i++)
	System.out.print(array[i]);

        input.close();

     }
}



       

    

