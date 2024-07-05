package com.engeto.hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Booking {
    private Guest guests;
    private List<Guest> otherGuest;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private VacationType typeOfVacation;

    public Booking(Guest guests, List<Guest> otherGuest, Room room, LocalDate startDate, LocalDate endDate, VacationType typeOfVacation) {
        this.guests = guests;
        this.otherGuest = otherGuest;
        this.room = room;
        this.startDate = startDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
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

    public long getBookingLength() {
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return daysBetween;
    }

    public int getPrice() {
        return (int) getBookingLength() * room.getPricePerNight();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", otherGuest=" + otherGuest +
                ", room=" + room +
                ", starDate=" + startDate +
                ", endDate=" + endDate +
                ", typeOfVacation=" + typeOfVacation +
                '}';
    }
}

