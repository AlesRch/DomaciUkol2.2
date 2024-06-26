package com.engeto.hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Booking {
    private Guest guests;
    private List<Guest> otherGuest;
    private static Room room;
    private static LocalDate starDate;
    private static LocalDate endDate;
    private VacationType typeOfVacation;

    public Booking(Guest guests, List<Guest> otherGuest, Room room, LocalDate starDate, LocalDate endDate, VacationType typeOfVacation) {
        this.guests = guests;
        this.otherGuest = otherGuest;
        this.room = room;
        this.starDate = starDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    public Guest getGuests() {
        return guests;
    }

    public void setGuests(Guest guests) {
        this.guests = guests;
    }

    public List<Guest> getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(List<Guest> otherGuest) {
        this.otherGuest = otherGuest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStarDate() {
        return starDate;
    }

    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public VacationType getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(VacationType typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public int getNumberOfGuests() {
        return otherGuest.size() +1;
        }

    public static long getBookingLength() {
        long daysBetween = ChronoUnit.DAYS.between(starDate, endDate);
        return daysBetween;
    }

    public static double getPrice() {
        return getBookingLength() * room.getPricePerNight();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", otherGuest=" + otherGuest +
                ", room=" + room +
                ", starDate=" + starDate +
                ", endDate=" + endDate +
                ", typeOfVacation=" + typeOfVacation +
                '}';
    }
}

