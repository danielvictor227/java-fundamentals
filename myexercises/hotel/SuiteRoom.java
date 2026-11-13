package myexercises.hotel;

public class SuiteRoom extends Room implements Premium {
    SuiteRoom(int number)
    {
        super(number);
    }

    @Override
    public double dailyRate() {
        return 300;
    }

    @Override
    public double serviceFee()
    {
        return 50;
    }
    @Override
    public String toString()
    {
        return super.toString() + " (Suite)";
    }    
}
