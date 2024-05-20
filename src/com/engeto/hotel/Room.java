package com.engeto.hotel;

public class Room {
    private int number;
    private int beds;
    private boolean balcony;
    private boolean seaView;
    private int pricePerNight;

    public Room(int number, int beds, boolean balcony, boolean seaView, int pricePerNight) {
        this.number = number;
        this.beds = beds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "Room number: " +number + " Beds: " + beds + " Balcony: " + balcony
                + " Seaview: " + seaView + " Price per day: " + pricePerNight + (" Kč");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", beds=" + beds +
                ", balcony=" + balcony +
                ", seaView=" + seaView +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
