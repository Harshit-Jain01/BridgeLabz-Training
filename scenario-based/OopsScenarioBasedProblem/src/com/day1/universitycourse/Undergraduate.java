package com.day1.universitycourse;

public class Undergraduate extends Student {

    public Undergraduate(String id, String name) {
        super(id, name);
    }

    public Undergraduate(String id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public String getLevel() {
        return "Undergraduate";
    }
}
