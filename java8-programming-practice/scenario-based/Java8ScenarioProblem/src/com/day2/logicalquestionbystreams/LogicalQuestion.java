package com.day2.logicalquestionbystreams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogicalQuestion {

    public static void main(String[] args) {

        // 1. Character Frequency Count
        String s1 = "banana";
        System.out.println("1. " +
                s1.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(), Collectors.counting()))
        );

        // 2. Word Frequency Count
        String s2 = "java is java and java is fast";
        System.out.println("2. " +
                Arrays.stream(s2.split(" "))
                      .collect(Collectors.groupingBy(
                              Function.identity(), Collectors.counting()))
        );

        // 3. First Non-Repeating Character
        String s3 = "stress";
        Character firstNonRepeat =
                s3.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(),
                          LinkedHashMap::new,
                          Collectors.counting()))
                  .entrySet().stream()
                  .filter(e -> e.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .findFirst()
                  .get();

        System.out.println("3. " + firstNonRepeat);

        // 4. All Non-Repeating Characters
        String s4 = "programming";
        System.out.println("4. " +
                s4.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(), Collectors.counting()))
                  .entrySet().stream()
                  .filter(e -> e.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .toList()
        );

        // 5. Remove Duplicate Characters
        String s5 = "banana";
        String noDuplicates =
                s5.chars()
                  .distinct()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());

        System.out.println("5. " + noDuplicates);

        // 6. Remove Repeating Characters (Keep Only Unique Once)
        String s6 = "aabbccdde";
        String uniqueOnly =
                s6.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(), Collectors.counting()))
                  .entrySet().stream()
                  .filter(e -> e.getValue() == 1)
                  .map(e -> String.valueOf(e.getKey()))
                  .collect(Collectors.joining());

        System.out.println("6. " + uniqueOnly);

        // 7. Remove Non-Alphanumeric Characters
        String s7 = "ja@va#8!!";
        String alphaNumeric =
                s7.chars()
                  .filter(Character::isLetterOrDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());

        System.out.println("7. " + alphaNumeric);

        // 8. Keep Only Alphabets
        String s8 = "java8stream2025";
        String alphabetsOnly =
                s8.chars()
                  .filter(Character::isLetter)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());

        System.out.println("8. " + alphabetsOnly);

        // 9. Keep Only Digits
        String s9 = "orderId=AB123XZ9";
        String digitsOnly =
                s9.chars()
                  .filter(Character::isDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());

        System.out.println("9. " + digitsOnly);

        // 10. Count Each Character Except Spaces
        String s10 = "java stream";
        System.out.println("10. " +
                s10.chars()
                   .mapToObj(c -> (char) c)
                   .filter(c -> c != ' ')
                   .collect(Collectors.groupingBy(
                           Function.identity(), Collectors.counting()))
        );
    }
}
