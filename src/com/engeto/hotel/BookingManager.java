package com.engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    public double getAvarageGuests() {
        if (bookings.isEmpty()) {
            return 0;
        }
        int totalGuests = 0;
        for (Booking booking : bookings) {
            totalGuests += booking.getNumberOfGuests();
        }
        return (double) totalGuests / bookings.size();
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

    public List<Booking> getBookings() {
        return bookings;
    }

    public void clearBookings() {
        bookings.clear();
    }


    public void printAllBookings() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            for (Booking booking : bookings) {
                System.out.println(booking);
        }
    }

    public List<Booking> getFirstEightRecreationalBookings() {
        List<Booking> recreationalBookings = new ArrayList<>();
        int count = 0;
        for (Booking booking : bookings) {
            if (booking.getTypeOfVacation() == VacationType.WORK) {
                recreationalBookings.add(booking);
                count++;
                if (count == 8) {
                    break;
                }
            }
        }
        return recreationalBookings;
    }
}