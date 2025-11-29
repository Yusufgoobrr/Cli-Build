package com.yusufkaya;

import com.yusufkaya.booking.Booking;
import com.yusufkaya.booking.BookingServiceClass;
import com.yusufkaya.car.Car;
import com.yusufkaya.car.CarServiceClass;
import com.yusufkaya.user.User;
import com.yusufkaya.user.UserServiceClass;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static void main(String[] args) {
        BookingServiceClass booking = new BookingServiceClass();
        CarServiceClass carServiceClass = new CarServiceClass();
        User[] users = new User[]{
                new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James", "Jalo", "1990-10-10"),
                new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "Jamila", "Jalo", "1990-10-10")
        };  Car[] cars = new Car[]{
                new Car("Mercedes", "S-Class", "Black", 1990,false),
                new Car("Bmw", "A-Class", "White", 1992,false),
                new Car("Tesla", "CyberTruck", "Red", 2024,true),
        };
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("""
                    1️⃣ - Book Car
                    2️⃣ - View All User Booked Cars
                    3️⃣ - View All Bookings
                    4️⃣ - View Available Cars
                    5️⃣ - View Available Electric Cars
                    6️⃣ - View all users
                    7️⃣ - Exit
                    """);
            System.out.print("Enter your choice:");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> BookingServiceClass.BookCar(booking);
                case 2 -> BookingServiceClass.viewAllBookings(booking);
                case 3 ->
                case 4 ->carServiceClass.getAllElectricCars(cars[3],3);
                case 5 -> carServiceClass.getAllCars(cars[3],3);
                case 6 -> UserServiceClass.getDetails(users);
                case 7 -> break;
                default -> System.out.println("Invalid Option");
            }
        }
        while (option != 7);

    }
}
