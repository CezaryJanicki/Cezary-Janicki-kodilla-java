package com.kodilla.good.patterns.challenges.allegro;

public class User {
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
