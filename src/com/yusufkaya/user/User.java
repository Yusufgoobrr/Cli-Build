package com.yusufkaya.user;

import java.util.UUID;

public class User {
    private UUID userId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public User() {
    }

    public User(UUID userId, String firstName, String lastName, String dateOfBirth) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and setters
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    @Override
    public String toString() {
        return "User{userId=" + userId + ", name='" + firstName + " " + lastName + "', dob='" + dateOfBirth + "'}";
    }
}