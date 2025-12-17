import java.util.Scanner;
class AreaOfTraingle{
    public static void main(String []args){
	//  creating object of Scanner and taking base and height as input from user
	Scanner kb=new Scanner(System.in);
	double base=kb.nextInt();
	double height=kb.nextInt();
	
	//calculating the area of triangle and converting in feet and inches
	double area=0.5*base*height;
	double areaInInches=area/2.54;
	double areaInFeet=areaInInches/12;

	//display the result
	System.out.println("Your area in cm "+area+" while in feet is "+areaInFeet+" and inches is "+areaInInches);
    }
}

