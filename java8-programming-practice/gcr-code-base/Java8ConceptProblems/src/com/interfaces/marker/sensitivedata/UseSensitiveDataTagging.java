package com.interfaces.marker.sensitivedata;

public class UseSensitiveDataTagging {
	
	 public static void main(String[] args) {

	        User user = new User("admin", "secret123");
	        ProductInfo product = new ProductInfo("Laptop", 75000);

	        Encryptionservice.encrypt(user);    
	        Encryptionservice.encrypt(product); 
	    }
}
