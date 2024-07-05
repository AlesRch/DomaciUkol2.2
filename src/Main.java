import com.engeto.hotel.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;
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
        Booking booking2 = new Booking(guest2, Arrays.asList(), room9, LocalDate.of(2021, 7, 15), LocalDate.of(2021, 7, 29), VacationType.WORK);

        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);
        fillBookings(guest5, guest6, guest7, room2, room3, bookingManager);

        //System.out.println("First eight recreation bookings: " + bookingManager.getFirstEightRecreationalBookings());
        System.out.println();
        System.out.println("First eight recreacional bookings: ");
        List<Booking> firstBookings = bookingManager.getFirstEightRecreationalBookings();
        for (Booking booking : firstBookings) {
            System.out.println(booking);
        }
        System.out.println();
        System.out.println("Statistics: ");
        printGuestStatistics(bookingManager);

        System.out.println();
        bookingManager.getAvarageGuests();
        System.out.println();

        System.out.println();
        System.out.println("Print all bookings:");
        bookingManager.printAllBookings();

        System.out.println();
        System.out.println("Print all bookings in formatted: ");
        printAllBookingsFormatted(bookingManager);

        System.out.println();
        System.out.println("Average number of guests per reservation: " + bookingManager.getAvarageGuests());

        System.out.println();
        int index = 1;
        Booking booking = bookingManager.getbooking(index);
        System.out.println("Reservation by index: " + booking);

        System.out.println();
        System.out.println("number of nights in the reservation: " + booking.getBookingLength());

        System.out.println("Number of Guests in the reservation: " + booking.getNumberOfGuests());

        System.out.println();
        System.out.println("Reservation price: " + booking.getPrice() + " Kč");

        System.out.println();
        System.out.println("Number of working bookings: " + bookingManager.getNumberOfWorkingBookings());

        System.out.println();
        bookingManager.clearBookings();
        System.out.println("Reservations have been deleted.");

        bookingManager.printAllBookings(); // Test, zda se skutečně nevypíší rezervace

    }

    public static void printGuestStatistics(BookingManager bookingManager) {
        int oneGuestCount = 0;
        int twoGuestCount = 0;
        int moreThanTwoGuestCount = 0;

        for (Booking booking : bookingManager.getBookings()) {
            int numberOfGuests = booking.getNumberOfGuests();
            if (numberOfGuests == 1) {
                oneGuestCount++;
            } else if (numberOfGuests == 2) {
                twoGuestCount++;
            } else if (numberOfGuests > 2) {
                moreThanTwoGuestCount++;
            }

        }
        System.out.println("Total number of bookings with one guest: " + oneGuestCount);
        System.out.println("Total number of bookings with two guests: " + twoGuestCount);
        System.out.println("Total number of bookings with more than two guests: " + moreThanTwoGuestCount);
    }


    public static void fillBookings(Guest guest5, Guest guest6, Guest guest7, Room room2, Room room3, BookingManager bookingManager) {
            Booking booking3 = new Booking(guest5, Arrays.asList(), room3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), VacationType.WORK);
            bookingManager.addBooking(booking3);
            Booking booking4 = new Booking(guest6, Arrays.asList(), room2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), VacationType.RECREATION);
            bookingManager.addBooking(booking4);
            Booking booking5 = new Booking(guest7, Arrays.asList(), room3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), VacationType.RECREATION);
            bookingManager.addBooking(booking5);

        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 8, 1);
        for (int i = 0; i <= 9; i++) {
            LocalDate endDate = startDate.plusDays(1);
            Booking booking = new Booking(guest7, Arrays.asList(), room2, startDate, endDate, VacationType.RECREATION);
            bookingManager.addBooking(booking);
            startDate = startDate.plusDays(2);
        }
    }

    public static void printAllBookingsFormatted(BookingManager bookingManager) {
        for (Booking booking : bookingManager.getBookings()) {
            String dateFrom = booking.getStartDate().toString();
            String dateTo = booking.getEndDate().toString();
            String guest = booking.getGuests().getDescription();
            int numberOfGuests = booking.getNumberOfGuests();
            boolean seaView = booking.getRoom().isSeaView() ? true : false;
            int price = booking.getPrice();

            System.out.println("from: " + dateFrom +  " to: " + dateTo + " guest: " + guest + "[" + "number of guests: " + numberOfGuests + " seaview: " + seaView + "]" + " price: " + price + " Kč");

        }
    }
}

   /*public static void fillBookings(BookingManager bookingManager, Guest guest, Room room) {
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 8, 1);
        for (int i = 0; i <= 10; i++) {
            LocalDate endDate = startDate.plusDays(1);
            Booking booking = new Booking(7, Arrays.asList(), 2, startDate, endDate, VacationType.RECREATION);
            bookingManager.addBooking(booking);
            startDate = startDate.plusDays(2);
        }
    }*/
