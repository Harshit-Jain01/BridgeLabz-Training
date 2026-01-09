package com.day7.onlinelearningportal;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected String title;
    protected String instructor;
    protected List<String> modules;

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
    }

    public abstract String generateCertificate();
}
