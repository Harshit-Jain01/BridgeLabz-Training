package com.day9.birdsanctuary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanctuary {
	
	static List<Bird>birdlist=new ArrayList<>();
	
	public static void addBird() {
			Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Bird Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Bird ID: ");
	        int id = sc.nextInt();

	        System.out.println("Select Species:");
	        System.out.println("1. Eagle  2. Kiwi  3. Duck  4. Penguin  5. Seagull  ");
	        int type = sc.nextInt();

	        Bird bird = switch (type) {
	            case 1 -> new Eagle(id,name);
	            case 2 -> new Kiwi(id,name);
	            case 3 -> new Duck(id,name);
	            case 4 -> new Penguin(id,name);
	            case 5 -> new Seagull(id,name);       
	            default -> null;
	        };
	            if (bird != null) {
	                birdlist.add(bird);
	                System.out.println("Bird added successfully.");
	            } else {
	                System.out.println("Invalid species.");
	            }
	      }
	
	public static void displayAllBird() {
	    for (Bird b : birdlist) {
	        b.displayInfo();
	        b.eat();
	    }
	}
	
	public static void displayflyBirds() {
		for(Bird b:birdlist) {
			if(b instanceof Flyable f) {
				System.out.println(b.getName());
				f.fly();
			}
		}
	}
	public static void displaySwimBirds() {
		for(Bird b:birdlist) {
			if(b instanceof Swimmable s) {
				System.out.println(b.getName());
				s.swim();
			}
		}
	}
	 public static  void displayBoth() {
	        for (Bird b : birdlist) {
	            if (b instanceof Flyable && b instanceof Swimmable) {
	            	System.out.println(b.getName()); 
	                ((Flyable) b).fly();
	                ((Swimmable) b).swim();
	            }
	        }
	    }
	public static void delete() {
		System.out.println("Enter bird id to be deleted");
		Scanner kb=new Scanner(System.in);
		int id=kb.nextInt();
		for(int i=0;i<birdlist.size();i++) {
			if(birdlist.get(i).getId()==id) {
				birdlist.remove(i);
				System.out.println("Bird removed successfully");
				return;
			}
		}
		System.out.println("Bird not found");
	}
	
	public static void report() {
		System.out.println("Total birds in sanctuary "+birdlist.size());
		  int fly = 0, swim = 0, both = 0, neither = 0;

	        for (Bird b :birdlist) {
	            boolean f = b instanceof Flyable;
	            boolean s = b instanceof Swimmable;

	            if (f && s) both++;
	            else if (f) fly++;
	            else if (s) swim++;
	            else neither++;
	        }

	        System.out.println("Sanctuary Report:");
	        System.out.println("Flyable Birds: " + fly);
	        System.out.println("Swimmable Birds: " + swim);
	        System.out.println("Both Fly & Swim: " + both);
	        System.out.println("Neither: " + neither);
		
		
	}
	
}
