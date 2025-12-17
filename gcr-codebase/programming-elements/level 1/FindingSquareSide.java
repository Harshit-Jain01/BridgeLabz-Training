import java.util.Scanner;
public class FindingSquareSide{
    public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking the perimeter of square from user
	double perimeter=kb.nextDouble();

	//finding the side of square
	double side=perimeter/4;

	//displaying the length of square
	System.out.println("The length of the side is "+side+"  whose perimeter is "+perimeter);
    }
}
	