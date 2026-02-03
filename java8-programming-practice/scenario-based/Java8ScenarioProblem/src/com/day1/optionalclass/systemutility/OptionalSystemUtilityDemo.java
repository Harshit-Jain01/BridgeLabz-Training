package com.day1.optionalclass.systemutility;


import java.util.Optional;

public class OptionalSystemUtilityDemo {

    public static void main(String[] args) {

        SystemConfig config = new SystemConfig(
                null,               
                null,               
                null,               
                "DARK_MODE"       
        );

        // 1. Read configuration value safely
        String configValue = Optional.ofNullable(config.configValue)
                .orElse("DEFAULT_CONFIG");
        System.out.println("Config Value: " + configValue);

        // 2. Fetch environment variable using Optional
        String javaHome = Optional.ofNullable(System.getenv("JAVA_HOME"))
                .orElse("JAVA_HOME not set");
        System.out.println("JAVA_HOME: " + javaHome);

        // 3. Return default file path if config is missing
        String filePath = Optional.ofNullable(config.filePath)
                .orElse("/usr/local/app/config.properties");
        System.out.println("File Path: " + filePath);

        // 4. Handle API response safely
        String apiResponse = Optional.ofNullable(config.apiResponse)
                .orElse("No response from API");
        System.out.println("API Response: " + apiResponse);

        // 5. Avoid null check while fetching user preferences
        Optional.ofNullable(config.userPreference)
                .ifPresent(p ->
                        System.out.println("User Preference: " + p));
    }
}
