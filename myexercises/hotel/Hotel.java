package myexercises.hotel;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> allRooms;
    ArrayList<Booking> activeBookings;
    double revenue;

    void addRoom(Room r) {
        for (Room room : allRooms) {
            if (room.getNumber() == r.getNumber()) {
                throw new IllegalArgumentException("Room already register!");
            }
        }
        allRooms.add(r);
    }

    Room findRoom(int number) {
        for (Room room : allRooms) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        System.out.println("The room was not found");
        return null;
    }

    Booking findBooking(String document) {
        for (Booking booking : activeBookings) {
            if (document.equals(booking.getGuest().getDocument())) {
                return booking;
            }
        }
        System.out.println("Guest not found");
        return null;
    }

    boolean isOccupied(Room r) {
        for (Booking booking : activeBookings) {
            if (booking.getRoom().equals(r)) {
                System.out.println("Room " + r.getNumber() + " is occupied");
                return true;
            }
        }
        System.out.println("Room " + r.getNumber() + " is not occupied");
        return false;
    }

    boolean guestIsHost(Guest guest) {
        for (Booking booking : activeBookings) {
            if (booking.getGuest().equals(guest)) {
                System.out.println("The guest is already hosted");
                return true;
            }
        }
        return false;
    }

    void checkIn(Guest g, int roomNumber, int nights) {
        Room newRoom = findRoom(roomNumber);

        if (nights < 1) {
            throw new IllegalArgumentException("Invalid daily!");
        }
        if (findRoom(roomNumber) == null) {
            throw new IllegalStateException("The room doesn't exists!");
        }

        if (isOccupied(newRoom) == true) {
            throw new IllegalStateException("The Room is occupied");
        }

        if (guestIsHost(g) == true) {
            throw new IllegalStateException();
        }

        Booking newBooking = new Booking(g, newRoom, nights);
        activeBookings.add(newBooking);

        System.out.println(newBooking);
    }


    double checkOut(String document)
    {
       Booking outBooking = findBooking(document);
       revenue += outBooking.total();
       System.out.printf("Check-Out: %s | %d days | R$%.2f\n", outBooking.getGuest(), outBooking.getDays(), outBooking.total());
       System.out.println(activeBookings.remove(outBooking));
       return outBooking.total();
    }

    int listAvailableRooms()
    {
        int available = 0;
        for(Booking booking : activeBookings)
        {
            if(isOccupied(booking.getRoom()) == false)
            {
                System.out.printf("Livre: <%s>\n", booking.getRoom().toString());
                available++;
            }
        }
        System.out.println("Total de Quartos Livres: " + available);
        return available;
    }

    String occupancy()
    {
        return listAvailableRooms()/allRooms.size() + "(Reservas ativas / Total de Quartos)";
    }

    double getRevenue()
    {
        return revenue;
    }
}

    