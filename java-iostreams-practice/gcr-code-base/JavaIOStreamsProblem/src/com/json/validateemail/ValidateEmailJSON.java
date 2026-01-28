package com.json.validateemail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailJSON{
    private static final Pattern EMAIL_PATTERN =
        Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void main(String[] args) {
        String jsonFile = "src/com/json/validateemail/data.json";

        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonContent.append(line);

            String json = jsonContent.toString();
            System.out.println(" Email Validation");

            validateEmails(json);

        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }

    private static void validateEmails(String json) {
        Pattern emailPattern = Pattern.compile("\"email\"\\s*:\\s*\"([^\"]+)\"");
        Matcher emailMatcher = emailPattern.matcher(json);

        boolean found = false;
        while (emailMatcher.find()) {
            found = true;
            String email = emailMatcher.group(1);
            boolean isValid = EMAIL_PATTERN.matcher(email).matches();

            System.out.println("Email: " + email);
            System.out.println("Status: " + (isValid ? "Valid" : "Invalid"));
            System.out.println();
        }

        if (!found) {
            System.out.println("No email field found in JSON");
        }
    }
}