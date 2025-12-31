package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int empId;
    private String empName;

    // Initializes employee details
    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    // Displays employee information
    void displayEmployee(){
        System.out.println("Employee ID: "+empId+", Name: "+empName);
    }
}



