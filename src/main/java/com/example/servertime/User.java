package com.example.servertime;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String urlImage;

    public User(int id, String name, String email, String address, String urlImage) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUrlImage() {
        return urlImage;
    }
}

