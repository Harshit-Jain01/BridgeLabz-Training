import java.util.*;

class ParkingLotSystem{
	
	public static void main(String []args){
	
	
	Scanner kb=new Scanner(System.in);
	
	int lot=5;
	
	//Options: Park, Exit, Show Occupancy
	int choice=0;
	while(lot>0 && choice!=3 ){
		System.out.println("Enter\n1.Show Occupancy\n2.Park\n3.exit");
	System.out.println("Enter choice");
	 choice=kb.nextInt();
	switch(choice){
	case 1:
	System.out.println("Total parking left: "+lot);
	break;
	case 2:
	System.out.println("Booked your slot successfully");
	lot--;
	break;
	case 3:
	System.out.println("Exit successfully");
	break;
	default:
	System.out.println("Invalid input");
	}
	}
	
	System.out.println("Thank you for visiting");
	kb.close();
	}

}