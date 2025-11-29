package com.yusufkaya.booking;

import com.yusufkaya.booking.*;
import com.yusufkaya.user.User;
import com.yusufkaya.car.Car;
import java.util.Date;
import java.util.UUID;

public class BookingServiceClass {
    private User[] users;
    private Car[] cars;
    private Booking[] bookings;
    private int userCount;
    private int carCount;
    private int bookingCount;

    public BookingServiceClass() {
        this.users = new User[10];
        this.cars = new Car[10];
        this.bookings = new Booking[10];
        this.userCount = 0;
        this.carCount = 0;
        this.bookingCount = 0;
        initializeSampleData();
    }

    private void initializeSampleData() {
        // Add sample users
        addUser(new User(UUID.randomUUID(), "John", "Doe", "1990-01-01"));
        addUser(new User(UUID.randomUUID(), "Jane", "Smith", "1992-05-15"));

        // Add sample cars
        addCar(new Car(UUID.randomUUID(), "Toyota", "Camry", "Red", 2022, false));
        addCar(new Car(UUID.randomUUID(), "Tesla", "Model 3", "Blue", 2023, true));
        addCar(new Car(UUID.randomUUID(), "Nissan", "Leaf", "White", 2021, true));
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount] = user;
            userCount++;
        }
    }

    public void addCar(Car car) {
        if (carCount < cars.length) {
            cars[carCount] = car;
            carCount++;
        }
    }

    public boolean bookCar(String userId, String carId) {
        User user = findUserById(userId);
        Car car = findCarById(carId);

        if (user != null && car != null && car.isAvailable() && bookingCount < bookings.length) {
            Booking booking = new Booking(
                    UUID.randomUUID().toString(),
                    new Date(),
                    user,
                    car
            );
            bookings[bookingCount] = booking;
            bookingCount++;
            car.setAvailable(false);
            return true;
        }
        return false;
    }

    public User[] getAllUsers() {
        User[] result = new User[userCount];
        for (int i = 0; i < userCount; i++) {
            result[i] = users[i];
        }
        return result;
    }

    public Car[] getAvailableCars() {
        int availableCount = 0;
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isAvailable()) {
                availableCount++;
            }
        }

        Car[] availableCars = new Car[availableCount];
        int index = 0;
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isAvailable()) {
                availableCars[index] = cars[i];
                index++;
            }
        }
        return availableCars;
    }

    public Car[] getAvailableElectricCars() {
        int electricCount = 0;
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isAvailable() && cars[i].isElectric()) {
                electricCount++;
            }
        }

        Car[] electricCars = new Car[electricCount];
        int index = 0;
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isAvailable() && cars[i].isElectric()) {
                electricCars[index] = cars[i];
                index++;
            }
        }
        return electricCars;
    }

    public Booking[] getAllBookings() {
        Booking[] result = new Booking[bookingCount];
        for (int i = 0; i < bookingCount; i++) {
            result[i] = bookings[i];
        }
        return result;
    }

    private User findUserById(String userId) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserId().toString().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }

    private Car findCarById(String carId) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getCarId().toString().equals(carId)) {
                return cars[i];
            }
        }
        return null;
    }
}