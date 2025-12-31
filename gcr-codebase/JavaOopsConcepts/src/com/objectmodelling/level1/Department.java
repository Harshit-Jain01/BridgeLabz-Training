package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Department{
    private String deptName;
    private List<Employee> employees=new ArrayList<>();

    // Creates a department
    Department(String deptName){
        this.deptName=deptName;
    }

    // Adds employees under this department (composition)
    void addEmployee(int id,String name){
        employees.add(new Employee(id,name));
    }

    // Displays department and its employees
    void displayDepartment(){
        System.out.println("Department: "+deptName);
        // Iterates through employees of this department
        for(Employee e:employees){
            e.displayEmployee();
        }
    }
}
