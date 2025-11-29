package com.yusufkaya.booking;

import com.yusufkaya.user.User;

public class BookingServiceClass extends Booking{
    public static void BookCar(Booking bookingDetails){
        System.out.println("Successfully Booked  " + bookingDetails.getBookedCar() + " for the user " + bookingDetails.getBookedUser() +".");

    }
    public static void viewAllBookings(Booking bookings){
        System.out.println(bookings);
    }

}
