package com.yusufkaya.user;

import com.yusufkaya.user.User;
import java.util.UUID;

public class UserServiceClass {
    private User[] users;
    private int userCount;

    public UserServiceClass() {
        this.users = new User[10];
        this.userCount = 0;
        initializeSampleUsers();
    }

    private void initializeSampleUsers() {
        // Add sample users
        addUser(new User(UUID.randomUUID(), "John", "Doe", "1990-01-01"));
        addUser(new User(UUID.randomUUID(), "Jane", "Smith", "1992-05-15"));
        addUser(new User(UUID.randomUUID(), "Bob", "Johnson", "1985-03-20"));
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount] = user;
            userCount++;
        }
    }

    public User[] getAllUsers() {
        User[] result = new User[userCount];
        for (int i = 0; i < userCount; i++) {
            result[i] = users[i];
        }
        return result;
    }

    public User findUserById(String userId) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserId().toString().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }

    public User createUser(String firstName, String lastName, String dateOfBirth) {
        User newUser = new User(UUID.randomUUID(), firstName, lastName, dateOfBirth);
        addUser(newUser);
        return newUser;
    }

    public int getUserCount() {
        return userCount;
    }
}