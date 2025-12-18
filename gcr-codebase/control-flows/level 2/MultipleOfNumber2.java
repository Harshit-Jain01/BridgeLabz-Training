import java.util.Scanner;
public class MultipleOfNumber2{
    public static void main(String[] args) {
        //creating object of Scanner and taking number from user
           Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	
	 //finding the multiple of number
        if(number<=0 || number>=100)
            System.out.println("Not a Valid Input");
        else {
            System.out.print("Multiples are ");
	    int counter=number;
            while(counter<100){
		System.out.println(counter+" ");
		counter+=number;
             }
        }
	input.close();
    }
}
