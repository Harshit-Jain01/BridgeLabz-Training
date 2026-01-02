package com.day1.universitycourse;

public class Postgraduate extends Student {

    public Postgraduate(String id, String name) {
        super(id, name);
    }

    public Postgraduate(String id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public String getLevel() {
        return "Postgraduate";
    }
}
