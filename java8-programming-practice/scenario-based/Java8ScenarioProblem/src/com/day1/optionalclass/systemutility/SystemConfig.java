package com.day1.optionalclass.systemutility;

public class SystemConfig {

    String configValue;
    String filePath;
    String apiResponse;
    String userPreference;

    public SystemConfig(String configValue,
                        String filePath,
                        String apiResponse,
                        String userPreference) {
        this.configValue = configValue;
        this.filePath = filePath;
        this.apiResponse = apiResponse;
        this.userPreference = userPreference;
    }
}