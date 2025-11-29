package com.yusufkaya.booking;

import com.yusufkaya.user.User;
import com.yusufkaya.car.Car;
import java.util.Date;
import java.util.UUID;

public class Booking {
    private String bookingId;
    private Date bookingDate;
    private User bookedUser;
    private Car bookedCar;

    public Booking() {
    }

    public Booking(String bookingId, Date bookingDate, User bookedUser, Car bookedCar) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedUser = bookedUser;
        this.bookedCar = bookedCar;
    }

    // Getters and setters
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }
    public Date getBookingDate() { return bookingDate; }
    public void setBookingDate(Date bookingDate) { this.bookingDate = bookingDate; }
    public User getBookedUser() { return bookedUser; }
    public void setBookedUser(User bookedUser) { this.bookedUser = bookedUser; }
    public Car getBookedCar() { return bookedCar; }
    public void setBookedCar(Car bookedCar) { this.bookedCar = bookedCar; }

    @Override
    public String toString() {
        return "Booking{id='" + bookingId + "', user=" + bookedUser.getFirstName() + ", car=" + bookedCar.getBrand() + " " + bookedCar.getModel() + "}";
    }
}