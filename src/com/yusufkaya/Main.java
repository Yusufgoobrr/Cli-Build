package com.yusufkaya;

import com.yusufkaya.booking.BookingServiceClass;
import com.yusufkaya.user.User;
import com.yusufkaya.car.Car;
import com.yusufkaya.booking.Booking;
import java.util.Scanner;

public class Main {
    private static BookingServiceClass bookingService = new BookingServiceClass();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        int choice = 0;

        do {
            System.out.println("\n=== Car Booking System ===");
            System.out.println("1. Book Car");
            System.out.println("2. View All User Booked Cars");
            System.out.println("3. View All Bookings");
            System.out.println("4. View Available Cars");
            System.out.println("5. View Available Electric Cars");
            System.out.println("6. View all users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            handleMenuChoice(choice);

        } while (choice != 7);

        scanner.close();
    }

    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                bookCar();
                break;
            case 2:
                viewAllUserBookedCars();
                break;
            case 3:
                viewAllBookings();
                break;
            case 4:
                viewAvailableCars();
                break;
            case 5:
                viewAvailableElectricCars();
                break;
            case 6:
                viewAllUsers();
                break;
            case 7:
                System.out.println("Thank you for using our system!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    private static void bookCar() {
        System.out.println("\n=== Book a Car ===");

        // Show available users
        User[] users = bookingService.getAllUsers();
        System.out.println("Available Users:");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i]);
        }
        System.out.print("Select user (number): ");
        int userIndex = scanner.nextInt() - 1;

        // Show available cars
        Car[] availableCars = bookingService.getAvailableCars();
        System.out.println("Available Cars:");
        for (int i = 0; i < availableCars.length; i++) {
            System.out.println((i + 1) + ". " + availableCars[i]);
        }
        System.out.print("Select car (number): ");
        int carIndex = scanner.nextInt() - 1;

        if (userIndex >= 0 && userIndex < users.length && carIndex >= 0 && carIndex < availableCars.length) {
            String userId = users[userIndex].getUserId().toString();
            String carId = availableCars[carIndex].getCarId().toString();

            boolean success = bookingService.bookCar(userId, carId);
            if (success) {
                System.out.println("Car booked successfully!");
            } else {
                System.out.println("Failed to book car. Please try again.");
            }
        } else {
            System.out.println("Invalid selection!");
        }
    }

    private static void viewAllUserBookedCars() {
        System.out.println("\n=== All User Booked Cars ===");
        Booking[] bookings = bookingService.getAllBookings();
        for (int i = 0; i < bookings.length; i++) {
            System.out.println("User: " + bookings[i].getBookedUser().getFirstName() +
                    " - Car: " + bookings[i].getBookedCar().getBrand() +
                    " " + bookings[i].getBookedCar().getModel());
        }
    }

    private static void viewAllBookings() {
        System.out.println("\n=== All Bookings ===");
        Booking[] bookings = bookingService.getAllBookings();
        for (int i = 0; i < bookings.length; i++) {
            System.out.println((i + 1) + ". " + bookings[i]);
        }
    }

    private static void viewAvailableCars() {
        System.out.println("\n=== Available Cars ===");
        Car[] availableCars = bookingService.getAvailableCars();
        for (int i = 0; i < availableCars.length; i++) {
            System.out.println((i + 1) + ". " + availableCars[i]);
        }
    }

    private static void viewAvailableElectricCars() {
        System.out.println("\n=== Available Electric Cars ===");
        Car[] electricCars = bookingService.getAvailableElectricCars();
        for (int i = 0; i < electricCars.length; i++) {
            System.out.println((i + 1) + ". " + electricCars[i]);
        }
    }

    private static void viewAllUsers() {
        System.out.println("\n=== All Users ===");
        User[] users = bookingService.getAllUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i]);
        }
    }
}