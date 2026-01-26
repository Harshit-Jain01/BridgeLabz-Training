package com.day10.hospitalmanagement;

class PatientNode {
    int checkInTime;     
    String patientName;
    int height;
    PatientNode left, right;

    PatientNode(int time, String name) {
        this.checkInTime = time;
        this.patientName = name;
        this.height = 1;
    }
}
