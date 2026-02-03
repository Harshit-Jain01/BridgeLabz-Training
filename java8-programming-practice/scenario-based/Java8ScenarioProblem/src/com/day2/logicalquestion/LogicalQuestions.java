package com.day2.logicalquestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}

public class LogicalQuestions{

    public static void main(String[] args) {

        // 1. Count vowels in a string
        String s1 = "programming";
        long vowels = s1.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("1. " + vowels);

        // 2. Count number of words
        String sentence = "Java is very powerful";
        long wordCount = Arrays.stream(sentence.split(" ")).count();
        System.out.println("2. " + wordCount);

        // 3. Find even numbers
        List<Integer> list1 = List.of(2,5,7,8,10,13);
        System.out.println("3. " +
                list1.stream().filter(n -> n % 2 == 0).toList());

        // 4. Convert strings to uppercase
        List<String> list2 = List.of("java","spring","boot");
        System.out.println("4. " +
                list2.stream().map(String::toUpperCase).toList());

        // 5. Find string length list
        List<String> list3 = List.of("cat","elephant","dog");
        System.out.println("5. " +
                list3.stream().map(String::length).toList());

        // 6. Count strings starting with 'a'
        List<String> list4 = List.of("apple","banana","ant","car");
        System.out.println("6. " +
                list4.stream().filter(x -> x.startsWith("a")).count());

        // 7. Remove empty strings
        List<String> list5 = List.of("java","","spring","","boot");
        System.out.println("7. " +
                list5.stream().filter(x -> !x.isEmpty()).toList());

        // 8. Sum of all numbers
        List<Integer> list6 = List.of(1,2,3,4,5);
        System.out.println("8. " +
                list6.stream().mapToInt(Integer::intValue).sum());

        // 9. Find max number
        List<Integer> list7 = List.of(10,25,3,99,45);
        System.out.println("9. " +
                list7.stream().max(Integer::compare).get());

        // 10. Reverse each string
        List<String> list8 = List.of("java","api");
        System.out.println("10. " +
                list8.stream()
                        .map(str -> new StringBuilder(str).reverse().toString())
                        .toList());

        // 11. Remove duplicates
        List<Integer> list9 = List.of(1,2,2,3,4,4,5);
        System.out.println("11. " +
                list9.stream().distinct().toList());

        // 12. Sort descending
        List<Integer> list10 = List.of(5,1,9,3);
        System.out.println("12. " +
                list10.stream().sorted(Comparator.reverseOrder()).toList());

        // 13. Second highest number
        List<Integer> list11 = List.of(10,40,30,20);
        System.out.println("13. " +
                list11.stream()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst().get());

        // 14. Join strings with comma
        List<String> list12 = List.of("Java","Spring","Boot");
        System.out.println("14. " +
                String.join(",", list12));

        // 15. Frequency of each character
        String s2 = "banana";
        System.out.println("15. " +
                s2.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting())));

        // 16. Numbers greater than 50
        List<Integer> list13 = List.of(10,55,60,23,90);
        System.out.println("16. " +
                list13.stream().filter(n -> n > 50).toList());

        // 17. Group strings by length
        List<String> list14 = List.of("a","bb","ccc","dd");
        System.out.println("17. " +
                list14.stream()
                        .collect(Collectors.groupingBy(String::length)));

        // 18. First non-repeated character
        String s3 = "stress";
        Character ch = s3.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println("18. " + ch);

        // 19. Convert Integer list to String list
        List<Integer> list15 = List.of(1,2,3);
        System.out.println("19. " +
                list15.stream().map(String::valueOf).toList());

        // 20. Word frequency
        String s4 = "java is java and java is fast";
        System.out.println("20. " +
                Arrays.stream(s4.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting())));

        // 21. Partition even and odd
        List<Integer> list16 = List.of(1,2,3,4,5,6);
        System.out.println("21. " +
                list16.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0)));

        // 22. Find duplicate elements only
        List<Integer> list17 = List.of(1,2,3,2,4,5,1);
        System.out.println("22. " +
                list17.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .toList());

        // 23. Longest string
        List<String> list18 = List.of("java","microservices","api");
        System.out.println("23. " +
                list18.stream()
                        .max(Comparator.comparingInt(String::length)).get());

        // 24. Top 3 highest numbers
        List<Integer> list19 = List.of(10,90,30,70,50);
        System.out.println("24. " +
                list19.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(3).toList());

        // 25. Flatten list of lists
        List<List<Integer>> list20 = List.of(
                List.of(1,2), List.of(3,4), List.of(5));
        System.out.println("25. " +
                list20.stream().flatMap(List::stream).toList());

        // 26. Sum of squares of even numbers
        List<Integer> list21 = List.of(1,2,3,4,5);
        System.out.println("26. " +
                list21.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(n -> n * n)
                        .sum());

        // 27. Sort map by value
        Map<String,Integer> map = Map.of("A",3,"B",1,"C",2);
        System.out.println("27. " +
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a,b)->a,
                                LinkedHashMap::new)));

        // 28. Employee with highest salary
        List<Employee> employees = List.of(
                new Employee(1,"Amit",50000),
                new Employee(2,"Ravi",75000),
                new Employee(3,"Neha",60000));
        System.out.println("28. " +
                employees.stream()
                        .max(Comparator.comparingDouble(e -> e.salary)).get());

        // 29. Common elements between two lists
        List<Integer> a = List.of(1,2,3,4);
        List<Integer> b = List.of(3,4,5,6);
        System.out.println("29. " +
                a.stream().filter(b::contains).toList());

        // 30. Kth smallest element
        List<Integer> list22 = List.of(9,1,5,3,7);
        int k = 2;
        System.out.println("30. " +
                list22.stream().sorted().skip(k-1).findFirst().get());
    }
}
