package com.javastreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream ("src/com/javastreams/input.txt");
				FileOutputStream fos=new FileOutputStream("src/com/javastreams/Output.txt")	)
		{	
			int data;
			while((data=fis.read())!=-1)
			{
				fos.write(data);
			}
		}catch(IOException e) {
			System.out.println("source file does not exist");
		}
				
		
		
	}

}
