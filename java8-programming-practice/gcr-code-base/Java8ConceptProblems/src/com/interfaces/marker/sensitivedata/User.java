package com.interfaces.marker.sensitivedata;

public class User implements SensitiveData {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}