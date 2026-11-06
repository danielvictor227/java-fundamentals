package myexercises.parking;
public class Motorcycle extends Vehicle {
    Motorcycle(String plate)
    {
        super(plate);
    }

    @Override 
    double hourlyRate()
    {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + " Motorcycle";
    }
}
