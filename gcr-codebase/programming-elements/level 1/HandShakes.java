import java.util.*;
class HandShakes{
       public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking input in numberOfStudents
	int numberOfStudents=kb.nextInt();
	
	//calculating the maximum number of handshakes
	int maxHandshakes=(numberOfStudents*(numberOfStudents-1))/2;

	//displaying number of possible handshakes.
	System.out.println("the number of possible handshakes "+maxHandshakes);
    }
}
