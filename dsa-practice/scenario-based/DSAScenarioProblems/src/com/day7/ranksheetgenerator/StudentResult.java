package com.day7.ranksheetgenerator;

import java.util.ArrayList;
import java.util.List;


public class StudentResult{

    public static void main(String[] args) {

        List<Student> indoreList = new ArrayList<>();
        indoreList.add(new Student("Aman", 95, "Indore"));
        indoreList.add(new Student("Riya", 90, "Indore"));
        indoreList.add(new Student("Karan", 85, "Indore"));
        indoreList.add(new Student("Neha", 80, "Indore"));

        List<Student> bhopalList = new ArrayList<>();
        bhopalList.add(new Student("Sahil", 96, "Bhopal"));
        bhopalList.add(new Student("Pooja", 90, "Bhopal"));
        bhopalList.add(new Student("Rohit", 88, "Bhopal"));
        bhopalList.add(new Student("Anita", 82, "Bhopal"));

        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(indoreList);
        allStudents.addAll(bhopalList);

        List<Student> rankList = RankGenerator.mergeSort(allStudents);

        // Display result
        System.out.println("Final State-wise Rank List:");
        int rank = 1;
        for (Student s : rankList) {
            System.out.println(rank++ + ". " + s.name + " - " + s.marks + " (" + s.district + ")");
        }
    }
}
