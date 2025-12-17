class DividingPen {
    public static void main(String []args){
	// declaring the total pens and students
	int pen=14, students=3;
	// finding how many pens each student will get 
	int PenEachStudentsReceive=pen/students;
	// finding the non-distributed pens
	int nonDistributedPens=pen%students;
	// Displaying the pens each student will get and  remaining pen not distributed
	System.out.println(" The Pen Per Student is "+PenEachStudentsReceive+" and the remaining pen not distributed is "+nonDistributedPens);
    }
}