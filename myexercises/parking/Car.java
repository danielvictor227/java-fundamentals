package myexercises.parking;

public class Car extends Vehicle {
    
    Car(String plate)
    {
        super(plate);
    }

    @Override 
    double hourlyRate()
    {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + " Car";
    }
}
