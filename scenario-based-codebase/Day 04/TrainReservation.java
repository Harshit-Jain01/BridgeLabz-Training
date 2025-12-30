import java.util.Scanner;
class TrainReservation{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int seats=5;
        int opt;
        System.out.println("Train Reservation System");
		
		//showing menu
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            opt=in.nextInt();
			
			//checking condition and displaying result
			
            switch(opt){
                case 1:
                    if(seats>0){
                        seats--;
                        System.out.println("Ticket booked successfully!");
                        System.out.println("Remaining seats: "+seats);
                    }else{
                        System.out.println("No seats available. Booking closed!");
                    }
                    break;
                case 2:
                    System.out.println("Seats available :"+seats);
                    break;
                case 3:
                    System.out.println("Thank you for using Train Reservation System.");
                    in.close();
                    return;
                default:
                    System.out.println("Try again.");
            }
            if(seats==0){
                System.out.println("\nAll seats are booked. System closed.");
                break;
            }
        }
    }
}
