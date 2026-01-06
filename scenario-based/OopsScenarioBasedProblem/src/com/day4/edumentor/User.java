package com.day4.edumentor;

abstract class User {
    protected String name;
    protected String email;
    protected int userId;

    public User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void displayUser() {
        System.out.println(name + " | " + email + " | ID: " + userId);
    }
}
