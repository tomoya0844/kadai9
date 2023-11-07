package com.kadai9.user;

public class User {
    private int id;
    private String name;
    private String occupation;

    public User(int id, String name, String occupation) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public String getOccupation() {
        return occupation;
    }
}
