package com.searching.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {

    public static void main(String[] args) {

        String filePath = "D:/Sample.txt";

        try (
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath, true)   // append mode
        ) {
            String line;
            System.out.println("Enter text (type 'exit' to stop):");

            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase("exit"))
                    break;

                writer.write(line);
                writer.write(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Input saved to file successfully.");
    }
}
