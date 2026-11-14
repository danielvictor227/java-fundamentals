package myexercises.hotel;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> allRooms;
    ArrayList<Booking> activeBookings;
    double revenue;


    Hotel()
        {
            this.allRooms = new ArrayList<>();
            this.activeBookings = new ArrayList<>();
        }
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
        
        return null;
    }

    Booking findBooking(String document) {
        for (Booking booking : activeBookings) {
            if (document.equals(booking.getGuest().getDocument())) {
                return booking;
            }
        }
       
        return null;
    }

    boolean isOccupied(Room r) {
        for (Booking booking : activeBookings) {
            if (booking.getRoom().equals(r)) {
                return true;
            }
        }
        
        return false;
    }


    void checkIn(Guest g, int roomNumber, int nights) {
        if (nights < 1) {
            throw new IllegalArgumentException("Invalid daily!");
        }

        Room newRoom = findRoom(roomNumber);

        
        if (newRoom == null) {
            throw new IllegalStateException("The room doesn't exists!");
        }

        if (isOccupied(newRoom) == true) {
            throw new IllegalStateException("The Room is occupied");
        }

        if (findBooking(g.getDocument()) != null) {
            throw new IllegalStateException();
        }

        Booking newBooking = new Booking(g, newRoom, nights);
        activeBookings.add(newBooking);

        System.out.println(newBooking.toString());
    }


    double checkOut(String document)
    {   
        Booking outBooking = findBooking(document);
        if(outBooking == null)
        {
            throw new IllegalStateException("Reservation doesn't found");
        }
       double total = outBooking.total();
       revenue += total;
       System.out.printf("Check-Out: %s | %d days | R$%.2f\n", outBooking.getGuest().getName(), outBooking.getDays(), total);
       activeBookings.remove(outBooking);
       return total;
    }

    int listAvailableRooms()
    {
        int available = 0;
        for(Room room : allRooms)
        {
            if(isOccupied(room) == false)
            {
                System.out.printf("Livre: %s\n", room.toString());
                available++;
            }
        }
        System.out.println("Total de Quartos Livres: " + available);
        return available;
    }

    String occupancy()
    {
        return activeBookings.size() + " / " + allRooms.size() + " (Reservas ativas / Total de Quartos)";
    }

    double getRevenue()
    {
        return revenue;
    }
}

    