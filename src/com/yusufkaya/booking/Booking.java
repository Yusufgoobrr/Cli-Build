package com.yusufkaya.booking;

import com.yusufkaya.user.User;
import com.yusufkaya.car.Car; // You'll need to import your Car class

import java.util.Date;
import java.util.Objects;

public class Booking {
    private String bookingId;
    private Date bookingDate;
    private User bookedUser;
    private Car bookedCar; // Changed from User to Car

    public Booking() {
    }

    public Booking(String bookingId, Date bookingDate, User bookedUser, Car bookedCar) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedUser = bookedUser;
        this.bookedCar = bookedCar;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public User getBookedUser() {
        return bookedUser;
    }

    public void setBookedUser(User bookedUser) {
        this.bookedUser = bookedUser;
    }

    public Car getBookedCar() {
        return bookedCar;
    }

    public void setBookedCar(Car bookedCar) {
        this.bookedCar = bookedCar;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId) &&
                Objects.equals(bookingDate, booking.bookingDate) &&
                Objects.equals(bookedUser, booking.bookedUser) &&
                Objects.equals(bookedCar, booking.bookedCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, bookingDate, bookedUser, bookedCar);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", bookedUser=" + bookedUser +
                ", bookedCar=" + bookedCar +
                '}';
    }
}