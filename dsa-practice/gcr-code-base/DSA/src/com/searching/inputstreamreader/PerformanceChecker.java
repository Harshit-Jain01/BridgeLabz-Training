package com.searching.inputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceChecker{

    public static long stringBuilderTest() {
        long start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static long stringBufferTest() {
        long start = System.nanoTime();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static long fileReaderWordCount(String filePath) throws IOException {
        long start = System.nanoTime();
        int wordCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty())
                wordCount += words.length;
        }
        reader.close();

        long end = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCount);
        return end - start;
    }

    public static long inputStreamReaderWordCount(String filePath) throws IOException {
        long start = System.nanoTime();
        int wordCount = 0;

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8
                )
        );

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty())
                wordCount += words.length;
        }
        reader.close();

        long end = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCount);
        return end - start;
    }

    public static void main(String[] args) throws Exception {

        long sbTime = stringBuilderTest();
        long sbufTime = stringBufferTest();

        System.out.println("StringBuilder Time (ns): " + sbTime);
        System.out.println("StringBuffer Time (ns): " + sbufTime);

        String filePath = "D:/Sample.txt"; 

        long frTime = fileReaderWordCount(filePath);
        long isrTime = inputStreamReaderWordCount(filePath);

        System.out.println("FileReader Time (ns): " + frTime);
        System.out.println("InputStreamReader Time (ns): " + isrTime);
    }
}
