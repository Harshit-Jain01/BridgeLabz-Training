package com.annotations.jsonfield;

public class JSONFieldDemo {

	 public static void main(String[] args) {

	        User user = new User( "Naman", 22,  "naman12t@example.com");
	        String json = JsonSerializer.toJson(user);
	        System.out.println(json);
	    }
}
