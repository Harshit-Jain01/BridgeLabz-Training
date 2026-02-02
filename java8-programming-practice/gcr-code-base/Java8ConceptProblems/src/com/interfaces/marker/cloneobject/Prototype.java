package com.interfaces.marker.cloneobject;

public class Prototype implements Cloneable {

    int id;
    String name;

    public Prototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}