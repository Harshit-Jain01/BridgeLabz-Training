package com.day9.birdsanctuary;

import java.util.Scanner;

public class BirdSanctuarySystem {
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		while(true) {
		System.out.println("Welcome to EcoWing Bird Sanctuary");
		System.out.println("1. Add Bird\n"
				+ "2. Display All Birds\n"
				+ "3. Display All Flying Birds\n"
				+ "4. Display All Swimming Birds\n"
				+ "5. Display Both Flying & Swimming Birds\n"
				+ "6. Delete Bird by ID\n"
				+ "7. Sanctuary Report\n"
				+ "8. Exit\n"
				+ "\n"
				+ "");
	
		System.out.println("Enter your choice");
		int choice=kb.nextInt();
		switch(choice) {
		case 1->Sanctuary.addBird();
		case 2->Sanctuary.displayAllBird();
		case 3->Sanctuary.displayflyBirds();
		case 4->Sanctuary.displaySwimBirds();
		case 5->Sanctuary.displayBoth();
		case 6->Sanctuary.delete();
		case 7->Sanctuary.report();
		case 8->{
			System.out.println("Exiting bird sanctury");
			return;
			}
		default->System.out.println("Wrong choice");
		}		
		}
	}
	
}
