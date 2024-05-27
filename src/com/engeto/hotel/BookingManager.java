package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    public int getNumberOfWorkingBookings() {
        int count = 0;
        for (Booking booking : bookings) {
            if (booking.getTypeOfVacation() == VacationType.WORK) {
                count++;
                }
            }
        return count;
        }

    public Booking getbooking(int index) {
        return bookings.get(index);
    }

    public void clearBookings() {
        bookings.clear();
    }

    public void printAllBookings() {
        for (Booking booking : bookings) {
        System.out.println(booking);
            }
    }
}