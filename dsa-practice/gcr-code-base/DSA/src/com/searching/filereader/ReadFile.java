package com.searching.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    public static void main(String[] args) {

        String filePath = "D:/Sample.txt";

        BufferedReader reader = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
