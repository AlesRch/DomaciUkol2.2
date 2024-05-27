import com.engeto.hotel.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Welcome to reservation system");


        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Marek", "Novák", LocalDate.of(1993, 4, 3));
        Guest guest4 = new Guest("Antonín", "Střelec", LocalDate.of(1985, 3, 1));
        Guest guest5 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest6 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest7 = new Guest("Karolína", "Tmavá", LocalDate.of(1990, 5, 20));

        List<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        guests.add(guest4);
        guests.add(guest5);
        guests.add(guest6);
        guests.add(guest7);

        System.out.println();
        System.out.println("Number of guests: " + guests.size());
        for (Guest guest : guests) {
            System.out.println(guest.getDescription());

        }

        Room room1 = new Room(101, 1, true, true, 1000);
        Room room2 = new Room(102, 1, true, true, 1000);
        Room room3 = new Room(103, 3, false, true, 2400);
        Room room4 = new Room(201, 3, true, true, 2000);
        Room room5 = new Room(202, 5, true, true, 2500);
        Room room6 = new Room(301, 2, true, true, 2400);
        Room room7 = new Room(302, 2, true, false, 2000);
        Room room8 = new Room(303, 2, true, false, 2000);
        Room room9 = new Room(304, 2, true, false, 2000);
        Room room10 = new Room(305, 2, true, false, 2000);
        Room room11 = new Room(401, 2, false, false, 2000);


        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);
        rooms.add(room8);
        rooms.add(room9);
        rooms.add(room10);
        rooms.add(room11);

        System.out.println();
        System.out.println("Number of rooms: " + rooms.size());
        for (Room room : rooms) {
            System.out.println(room.getDescription());

        }

        Booking booking1 = new Booking(guest1, Arrays.asList(guest2), room1, LocalDate.of(2021, 7, 16), LocalDate.of(2021, 7, 26), VacationType.RECREATION);
        Booking booking2 = new Booking(guest2, Arrays.asList(), room3, LocalDate.of(2021, 7, 15), LocalDate.of(2021, 7, 29), VacationType.WORK);


        System.out.println();
        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);

        fillBookings(bookingManager, guest7, room2);

        bookingManager.printAllBookings();



        System.out.println();
        System.out.println("Number of working bookings: " + bookingManager.getNumberOfWorkingBookings());

        System.out.println();
        int index = 1;
        Booking booking = bookingManager.getbooking(index);
        System.out.println("Reservation by index: " + booking);

        System.out.println();
        bookingManager.clearBookings();
        System.out.println("Reservations have been deleted.");

        bookingManager.printAllBookings(); // Test, zda se skutečně nevypíší rezervace

    }

    public static void fillBookings(BookingManager bookingManager, Guest guest7, Room room) {
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 8, 1);
        for (int i = 0; i < 10; i++) {
            LocalDate endDate = startDate.plusDays(1);
            Booking booking = new Booking(guest7, Arrays.asList(), room, startDate, endDate, VacationType.WORK);
            bookingManager.addBooking(booking);
            startDate = startDate.plusDays(2);
        }


    }
}