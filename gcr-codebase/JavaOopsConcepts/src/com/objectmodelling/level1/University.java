package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class University{
    private String universityName;
    private List<UniDepartment> departments=new ArrayList<>();
    private List<Faculty> faculties=new ArrayList<>();

    // Creates a university
    University(String universityName){
        this.universityName=universityName;
    }

    // Adds department to university (composition)
    void addDepartment(String deptName){
        departments.add(new UniDepartment(deptName));
    }

    // Adds faculty to university (aggregation)
    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    // Displays university structure
    void displayUniversity(){
        System.out.println("University: "+universityName);

        System.out.println("Departments:");
        // Iterates through university departments
        for(UniDepartment d:departments){
            System.out.println(d.getDeptName());
        }

        System.out.println("Faculties:");
        // Iterates through faculty members
        for(Faculty f:faculties){
            System.out.println(f.getName());
        }
    }
}
