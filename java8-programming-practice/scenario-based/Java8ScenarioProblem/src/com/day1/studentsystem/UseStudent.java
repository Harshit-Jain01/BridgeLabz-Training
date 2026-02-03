package com.day1.studentsystem;

import java.util.*;
import java.util.stream.Collectors;

public class UseStudent {

    public static void main(String[] args) {

        // ===================== Creating Student List =====================
        List<Student> students = new ArrayList<>();

        students.add(new Student("S01","Harshit","Jain","Male","Delhi","98765","Computer",21,12));
        students.add(new Student("S02","Amit","Sharma","Male","Mumbai","98766","Mechanical",24,45));
        students.add(new Student("S03","Neha","Verma","Female","Pune","98767","Electronics",22,33));
        students.add(new Student("S04","Rohit","Singh","Male","Delhi","98768","Computer",26,8));
        students.add(new Student("S05","Anjali","Gupta","Female","Jaipur","98769","Mechanical",23,19));
        students.add(new Student("S06","Kunal","Mehta","Male","Ahmedabad","98770","Civil",27,60));
        students.add(new Student("S07","Rina","Patel","Female","Mumbai","98771","Computer",20,5));
        students.add(new Student("S08","Arjun","Iyer","Male","Chennai","98772","Electronics",25,40));
        students.add(new Student("S09","Sneha","Nair","Female","Kochi","98773","Mechanical",22,70));
        students.add(new Student("S10","Suman","Das","Male","Kolkata","98774","Computer",28,90));
        students.add(new Student("S11","Pooja","Roy","Female","Mumbai","98775","Civil",21,15));
        students.add(new Student("S12","Imran","Khan","Male","Bhopal","98776","Electronics",29,55));

        // ================= BASIC FILTERING & MAPPING =================

        System.out.println("\n1. Students whose rank is less than 50:");
        students.stream().filter(s -> s.rank < 50).forEach(System.out::println);

        System.out.println("\n2. Students whose age is greater than 25:");
        students.stream().filter(s -> s.age > 25).forEach(System.out::println);

        System.out.println("\n3. Names of all students:");
        students.stream().map(s -> s.firstname).forEach(System.out::println);

        System.out.println("\n4. Students belonging to Mechanical Engineering:");
        students.stream().filter(s -> s.branch.equalsIgnoreCase("Mechanical"))
                .forEach(System.out::println);

        System.out.println("\n5. Students not from Mumbai:");
        students.stream().filter(s -> !s.city.equalsIgnoreCase("Mumbai"))
                .forEach(System.out::println);


        System.out.println("\n6. Students sorted by rank (ascending):");
        students.stream().sorted(Comparator.comparingInt(s -> s.rank))
                .forEach(System.out::println);

        System.out.println("\n7. Students sorted by age (descending):");
        students.stream().sorted(Comparator.comparingInt((Student s) -> s.age).reversed())
                .forEach(System.out::println);

        System.out.println("\n8. Top 5 students based on rank:");
        students.stream().sorted(Comparator.comparingInt(s -> s.rank))
                .limit(5).forEach(System.out::println);

        System.out.println("\n9. Last 3 students based on rank:");
        students.stream().sorted(Comparator.comparingInt((Student s) -> s.rank).reversed())
                .limit(3).forEach(System.out::println);

        System.out.println("\n10. Students sorted by name and then rank:");
        students.stream()
                .sorted(Comparator.comparing((Student s) -> s.firstname)
                        .thenComparingInt(s -> s.rank))
                .forEach(System.out::println);


        System.out.println("\n11. Count of students in each department:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.branch, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n12. Count of students in each city:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.city, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n13. Average age of students in each department:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.branch,
                        Collectors.averagingInt(s -> s.age)))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n14. Average rank of students by gender:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.gender,
                        Collectors.averagingInt(s -> s.rank)))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n15. Total number of students:");
        System.out.println(students.size());

        System.out.println("\n16. Department with highest average rank:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.branch,
                        Collectors.averagingInt(s -> s.rank)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);


        System.out.println("\n17. Best rank holder:");
        students.stream().min(Comparator.comparingInt(s -> s.rank))
                .ifPresent(System.out::println);

        System.out.println("\n18. Worst rank holder:");
        students.stream().max(Comparator.comparingInt(s -> s.rank))
                .ifPresent(System.out::println);

        System.out.println("\n19. Second best rank holder:");
        students.stream().sorted(Comparator.comparingInt(s -> s.rank))
                .skip(1).findFirst().ifPresent(System.out::println);

        System.out.println("\n20. Third best rank holder:");
        students.stream().sorted(Comparator.comparingInt(s -> s.rank))
                .skip(2).findFirst().ifPresent(System.out::println);

        System.out.println("\n21. Youngest student:");
        students.stream().min(Comparator.comparingInt(s -> s.age))
                .ifPresent(System.out::println);

        System.out.println("\n22. Oldest student:");
        students.stream().max(Comparator.comparingInt(s -> s.age))
                .ifPresent(System.out::println);


        System.out.println("\n23. All contact numbers:");
        students.stream().map(s -> s.contact).forEach(System.out::println);

        System.out.println("\n24. Total contact numbers:");
        System.out.println(students.size());

        System.out.println("\n25. Unique contact numbers:");
        students.stream().map(s -> s.contact).distinct()
                .forEach(System.out::println);


        System.out.println("\n26. Any student from Biotech Engineering?");
        System.out.println(students.stream()
                .anyMatch(s -> s.branch.equalsIgnoreCase("Biotech")));

        System.out.println("\n27. All students above age 20?");
        System.out.println(students.stream()
                .allMatch(s -> s.age > 20));

        System.out.println("\n28. No student from Civil Engineering?");
        System.out.println(students.stream()
                .noneMatch(s -> s.branch.equalsIgnoreCase("Civil")));


        System.out.println("\n29. Count male and female students:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n30. Average age of male students:");
        students.stream().filter(s -> s.gender.equals("Male"))
                .mapToInt(s -> s.age).average()
                .ifPresent(System.out::println);

        System.out.println("\n31. Average age of female students:");
        students.stream().filter(s -> s.gender.equals("Female"))
                .mapToInt(s -> s.age).average()
                .ifPresent(System.out::println);

        System.out.println("\n32. Highest ranked male student:");
        students.stream().filter(s -> s.gender.equals("Male"))
                .min(Comparator.comparingInt(s -> s.rank))
                .ifPresent(System.out::println);

        System.out.println("\n33. Highest ranked female student:");
        students.stream().filter(s -> s.gender.equals("Female"))
                .min(Comparator.comparingInt(s -> s.rank))
                .ifPresent(System.out::println);


        System.out.println("\n34. Map<Id, Name>:");
        Map<String,String> idNameMap =
                students.stream().collect(Collectors.toMap(s -> s.id, s -> s.firstname));
        System.out.println(idNameMap);

        System.out.println("\n35. Map<Department, List<Student>>:");
        Map<String,List<Student>> deptMap =
                students.stream().collect(Collectors.groupingBy(s -> s.branch));
        deptMap.forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n36. Students whose name starts with S:");
        students.stream().filter(s -> s.firstname.startsWith("S"))
                .forEach(System.out::println);

        System.out.println("\n37. Students whose name length > 5:");
        students.stream().filter(s -> s.firstname.length() > 5)
                .forEach(System.out::println);

        System.out.println("\n38. Students with even rank:");
        students.stream().filter(s -> s.rank % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\n39. Students with odd rank:");
        students.stream().filter(s -> s.rank % 2 != 0)
                .forEach(System.out::println);


        System.out.println("\n40. Top 3 youngest students:");
        students.stream().sorted(Comparator.comparingInt(s -> s.age))
                .limit(3).forEach(System.out::println);

        System.out.println("\n41. Top 3 oldest students:");
        students.stream().sorted(Comparator.comparingInt((Student s) -> s.age).reversed())
                .limit(3).forEach(System.out::println);

        System.out.println("\n42. Partition students based on age > 25:");
        students.stream()
                .collect(Collectors.partitioningBy(s -> s.age > 25))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n43. Partition students based on rank < 100:");
        students.stream()
                .collect(Collectors.partitioningBy(s -> s.rank < 100))
                .forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n44. City with maximum students:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.city, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

        System.out.println("\n45. Department with minimum students:");
        students.stream()
                .collect(Collectors.groupingBy(s -> s.branch, Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
