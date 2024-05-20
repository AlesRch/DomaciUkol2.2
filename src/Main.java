import com.engeto.hotel.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Marek", "Novák", LocalDate.of(1993, 4, 3));
        Guest guest4 = new Guest("Antonín", "Střelec", LocalDate.of(1985, 3, 1));

        List<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        guests.add(guest4);

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

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        System.out.println();
        System.out.println("Number of rooms: " + rooms.size());
        for (Room room : rooms) {
            System.out.println(room.getDescription());
        }

        Booking booking1 = new Booking(guest1, Arrays.asList(guest2), room1, LocalDate.of(2021, 7, 16), LocalDate.of(2021,7,26), VacationType.RECREATION);
        Booking booking2 = new Booking(guest2, Arrays.asList() , room2, LocalDate.of(2021, 7,15), LocalDate.of(2021,7,29), VacationType.WORK);


        System.out.println();
        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);

        bookingManager.printAllBookings();
    }
}
