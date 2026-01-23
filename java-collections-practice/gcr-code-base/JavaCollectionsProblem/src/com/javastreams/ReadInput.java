package com.javastreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput {
	
	public static void main(String[] args) {
		
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter("src/com/javastreams/Output.txt")
				){
			System.out.println("enter name");
			String name=br.readLine();
			System.out.println("enter age");
			int age=Integer.parseInt(br.readLine());
			System.out.println("enter language");
			String lang=br.readLine();
			fw.write("Name "+name+"\n");
			fw.write("Age "+age+"\n");
			fw.write("fav language: "+lang);	
		}catch (IOException e) {
            System.out.println("I/O Error occurred");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered");
        }	
	}

}
