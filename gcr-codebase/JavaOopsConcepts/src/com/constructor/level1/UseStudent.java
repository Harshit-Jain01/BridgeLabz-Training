package com.constructor.level1;

public class UseStudent{

    public static void main(String[] args) {

        PostgraduateStudent pg=new PostgraduateStudent(101,"Harsh",8.5,"Computer science");
        pg.displayDetails();

        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

