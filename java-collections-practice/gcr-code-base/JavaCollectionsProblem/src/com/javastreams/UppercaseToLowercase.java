package com.javastreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(  new InputStreamReader( new FileInputStream("src/com/javastreams/input.txt"),
            		  StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/com/javastreams/output.txt"),
            		 StandardCharsets.UTF_8))){
        	int ch;
            while ((ch = br.read()) != -1) {
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                }

                bw.write(ch);
            }

            System.out.println("Uppercase letters converted to lowercase successfully!");

        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        } 
    }
}
