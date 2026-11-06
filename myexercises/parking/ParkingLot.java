package myexercises.parking;
import java.util.ArrayList;

public class ParkingLot{
    int capacity;
    ArrayList<Ticket> activeTickets;
    double accumulatedRevenue;

    ParkingLot(int capacity)
    {
        this.capacity = capacity;
        activeTickets = new ArrayList<>();
    }

    void enter(Vehicle vehicle)
    {
        if(activeTickets.size() >= capacity)
        {
            throw new IllegalStateException("Parking lot is Full");
        }
        for(int i = 0; i < activeTickets.size(); i++)
        {
            if(activeTickets.get(i).vehicle.getPlate().equals(vehicle.getPlate()))
            {
                throw new IllegalStateException("The vehicle is already inside of the Parking Lot");
            }
        }
        activeTickets.add(new Ticket(vehicle));
        System.out.printf("Enter: %s | %s\n", vehicle.toString(), activeTickets.get(activeTickets.size() - 1).toString());
    }

    Ticket findTicket(String plate)
    {
        for(int i = 0; i < activeTickets.size(); i++)
        {
            if(activeTickets.get(i).vehicle.getPlate().toUpperCase().equals(plate))
            {
                return activeTickets.get(i);
            }
        }
        return null;
    }

    double exit(String plate, int hours)
    {
        double total = 0;

        if(hours < 1)
        {
            throw new IllegalArgumentException("Invalid hours");
        }
        for(int i = 0; i < activeTickets.size(); i++)
        {
            if(activeTickets.get(i).vehicle.getPlate() == plate)
            {
                Vehicle vehicle = activeTickets.get(i).vehicle;
                total =  vehicle.hourlyRate() * hours;
                activeTickets.remove(i);
                accumulatedRevenue += total;
                System.out.printf("Exit: %s | %dh | R$ %.2f\n", vehicle.toString(), hours, total);
            }
        }
        return total;
    }

    int freeSpots()
    {
        return capacity - activeTickets.size();
    }

    void listVehicles()
    {
        for(Ticket activeTicket : activeTickets)
        {
            System.out.printf("%s - %s\n", activeTicket.toString(), activeTicket.vehicle.toString());
        }
    }
    
    double getRevenue()
    {
        return accumulatedRevenue;
    }
}
