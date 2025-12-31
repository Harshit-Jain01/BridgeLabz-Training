package com.objectmodelling.level1;

class Faculty{
    private int facultyId;
    private String name;

    // Creates a faculty member
    Faculty(int facultyId,String name){
        this.facultyId=facultyId;
        this.name=name;
    }

    String getName(){
        return name;
    }
}
