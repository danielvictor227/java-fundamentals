package myexercises.hotel;

public class StandardRoom extends Room {

    StandardRoom(int number)
    {
        super(number);
    }
    
    @Override
    double dailyRate() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + " (Standard)";
    }
}
