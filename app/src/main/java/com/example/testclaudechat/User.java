package com.example.testclaudechat;

public class User {
    private String id;
    private String name;
    private String email;

    public User() {
        // Default constructor required for Firestore
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}