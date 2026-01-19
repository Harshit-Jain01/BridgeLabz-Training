package com.collectionsframework.map;

import java.util.*;

public class FrequencyWordCounter {
	public static Map<String, Integer> countWordFrequency(String text) {
		Map<String, Integer> frequencyMap = new HashMap<>();

		String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", " ");

		String[] words = cleanedText.split("\\s+");

		for (String word : words) {
			// skip empty strings
			if (!word.isEmpty()) {
				frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
			}
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		String text = "Hello world, hello Java! Hello again, welcome ";

		System.out.println("Input text:");
		System.out.println(text);
		System.out.println();

		Map<String, Integer> result = countWordFrequency(text);

		System.out.println("Word frequency (case-insensitive, without punctuation):");
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}