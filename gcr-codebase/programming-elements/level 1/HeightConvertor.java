import java.util.Scanner;
class HeightConvertor{
    public static void main(String []args){
	// Creating Scanner object and taking height from user in cm
	Scanner kb = new Scanner(System.in);
	int height=kb.nextInt();

	// converting height in feet and inches
	double inches=height*(1/2.54);
	double foot=inches/12;

	//displaying height in foot and inches
	System.out.println("Your Height in cm is "+height+" while in feet is "+foot+"  and inches is "+inches);
    }
}

	
