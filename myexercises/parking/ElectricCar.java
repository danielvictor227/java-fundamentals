package myexercises.parking;

public class ElectricCar extends Car implements Electric
{

    ElectricCar(String plate)
    {
        super(plate);
    }
    
    @Override 
    public double chargingFee()
    {
        return 15;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Electric)";
    }
}