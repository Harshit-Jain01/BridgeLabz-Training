package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class Company{
    private String companyName;
    private List<Department> departments=new ArrayList<>();

    // Creates a company
    Company(String companyName){
        this.companyName=companyName;
    }

    // Adds departments under the company 
    void addDepartment(Department dept){
        departments.add(dept);
    }

    // Displays company, departments, and employees
    void displayCompany(){
        System.out.println("Company: "+companyName);
        // Iterates through all departments of the company
        for(Department d:departments){
            d.displayDepartment();
        }
    }
}


