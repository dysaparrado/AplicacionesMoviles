package com.example.ds22.recyclerview;

/**
 * Created by ds22 on 18/02/18.
 */

public class Users {
    public Users() {
    }

    public Users(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
