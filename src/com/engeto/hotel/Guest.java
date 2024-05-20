package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;


    public Guest(String firstName, String lastName, LocalDate birthOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = birthOfDate;
    }

    public String getDescription() {
        return firstName + " " + lastName + " (" + dateOfBirth + ")";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
