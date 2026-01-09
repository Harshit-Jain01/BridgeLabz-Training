package com.day7.artmarketplace;

public class UseArtMarket {
		public static void main(String[] args) {
			User user = new User("Raj",15000);

	        Artwork art1 = new DigitalArt("Neon City", "Aarya", 5000, "Standard");
	        Artwork art2 = new PrintArt("Vintage Dreams", "Rohan", 1500, "Extended", true);

	        art1.purchase(user);
	        art1.license();

	        art2.purchase(user);
	        art2.license();
	}
		
}
