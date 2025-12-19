import java.util.Scanner;

class MeanHeight{
   public static void main(String[] args) {

      // Create a Scanner Object and  creating an array of double to store height
      Scanner input = new Scanner(System.in);
      double []height=new double[11];

      
      // taking height as input
      for(int i=0;i<height.length;i++){
      System.out.println("Enter a height");
      height[i]=input.nextInt();
      }
      

      //finding sum of height
      double total=0;
      for(int i=0;i<height.length;i++){
      total+=height[i];
      }

      //displaying the mean height
	System.out.println("mean height of players present in a football team "+total/11);

      input.close();

   }
}