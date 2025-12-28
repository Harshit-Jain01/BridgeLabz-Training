package com.constructor.level1;

public class HotelBookingSystem{
	    
	    //Attributes
	    String guestName;
	    String roomType;
	    int nights;

	    // Default constructor
	    public HotelBookingSystem(){
	        this.guestName="Unknown Guest";
	        this.roomType="Standard";
	        this.nights=1;
	    }

	    // Parameterized constructor
	    public HotelBookingSystem(String guestName,String roomType,int nights){
	        this.guestName=guestName;
	        this.roomType=roomType;
	        this.nights=nights;
	    }

	    // Copy constructor
	    public HotelBookingSystem(HotelBookingSystem b){
	        this.guestName=b.guestName;
	        this.roomType=b.roomType;
	        this.nights=b.nights;
	    }

	    // Method to display booking details
	    public void displayBooking(){
	        System.out.println("Guest Name:"+guestName);
	        System.out.println("Room Type:"+roomType);
	        System.out.println("Nights:"+nights);
	        System.out.println();
	    }

	    // Main method to test constructors
	    public static void main(String[] args){

	        //default constructor
	        HotelBookingSystem book1=new HotelBookingSystem();

	        //parameterized constructor
	        HotelBookingSystem book2=new HotelBookingSystem("Raman","AC",6);

	        //copy constructor
	        HotelBookingSystem book3=new HotelBookingSystem(book2);

	        book1.displayBooking();
	        book2.displayBooking();
	        book3.displayBooking();
	    }
}
