package com.yusufkaya.user;

public class UserServiceClass extends User{
public static void getDetails(User[] user){
    System.out.println(user.getUserId());
    System.out.println(user.getFirstName());
    System.out.println(user.getLastName());
    System.out.println(user.getDateOfBirth());
}
}
