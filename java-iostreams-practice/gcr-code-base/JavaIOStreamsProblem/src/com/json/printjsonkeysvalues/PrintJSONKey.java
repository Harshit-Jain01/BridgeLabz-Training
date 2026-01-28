package com.json.printjsonkeysvalues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintJSONKey{
    public static void main(String[] args) {
        String jsonFile = "src/com/json/printjsonkeysvalues/data.json";
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonContent.append(line);
            
            String json = jsonContent.toString();
            
            System.out.println("All Keys and Values");
            printKeyValuePairs(json);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }
    
    private static void printKeyValuePairs(String json) {
        extractAndPrint(json, "\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\""); 
        extractAndPrint(json, "\"([^\"]+)\"\\s*:\\s*(\\d+(?:\\.\\d+)?)"); 
        extractAndPrint(json, "\"([^\"]+)\"\\s*:\\s*(true|false)"); 
    }
    
    private static void extractAndPrint(String json, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(json);
        while (matcher.find()) {
            System.out.println("Key: " + matcher.group(1) + " | Value: " + matcher.group(2));
        }
    }
}