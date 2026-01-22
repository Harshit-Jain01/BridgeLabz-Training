package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new FileReader("src/com/exceptionhandling/info.txt"))){
			String line;
			if((line=br.readLine())!=null)
				System.out.println(line);
				
		}catch(IOException e) {
			System.out.println("Error reading file");
		}
	}

}
