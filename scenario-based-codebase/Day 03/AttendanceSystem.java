import java.util.*;

class AttendanceSystem{
	
	public static void main(String []args){
	
	Scanner kb=new Scanner(System.in);
	
	//storing students name
	String []students={"Abhay","Aman","Jiya","Roy","Martin","Robert","Charlie","Ram","Deepak","Ranveer"};
	
	int present=0,absent=0;
	
	//taking attendence
	for(int i=0;i<students.length;i++){
	System.out.println(students[i]+" Present(P) or Absent(A)");
	String attendence=kb.next();
	if(attendence.charAt(0)=='P' ||attendence.charAt(0)=='p')
	present++;
	else
	absent++;
	}
	
	System.out.println("Total present "+present);
	System.out.println("Total absent "+absent);
	
	}
}
	
	
	