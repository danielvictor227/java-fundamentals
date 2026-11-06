package myexercises.parking;

public class Ticket {
    static int counter;
    int id; 
    Vehicle vehicle;

    Ticket(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        counter++;
        id = counter;
    }

    static int totalTickets()
    {
        return counter;
    }

    double total(int hours)
    {
        double total = 0;
        if(vehicle instanceof Electric eletric)
    {
        total+= eletric.chargingFee();
    }
       total+= hours * vehicle.hourlyRate();
       
       return total;
    }

    @Override
    public String toString() {
        return "Ticket #" + id;
    }
}
