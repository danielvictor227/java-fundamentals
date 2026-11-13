package myexercises.hotel;

public class Booking {
    static int reserve;
    private int id;
    private Guest guest;
    private Room room;
    private int days;

    Booking(Guest guest, Room room, int days)
    {
        guest = this.guest;
        room = this.room;
        days = this.days;
        reserve++;
        id = reserve;
    }

    static int reserveReturn(){
        return reserve;
    }

    double total()
    {
        double totalValue = 0;
        if(room instanceof SuiteRoom suite)
        {
            totalValue += suite.serviceFee();
        }
         totalValue += days * room.dailyRate();
        return totalValue;
    }

    public Guest getGuest() {
        return guest;
    }
    public int getDays() {
        return days;
    }
    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        
        return "Check-in: " +guest.getName() + "-> " + super.toString() + "| Reserva #" + id;
    }
}
