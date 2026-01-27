package com.day1.coderepocleaner;

import java.io.IOException;

public class UseCodeRepoCleaner {
	 public static void main(String[] args) {
	        CodeRepoCleaner cleaner = new CodeRepoCleaner();
	        
	        // sample repo path
	        String sourceFolder = "src/samplefiles/myrepo";
	        String outputBase = "src/samplefiles/myrepocleaned";
	        try {
	            cleaner.cleanRepo(sourceFolder, outputBase);

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
}
}