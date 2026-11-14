package myexercises.hotel;

public abstract class Room {
    private int number;

    Room(int number)
    {
        this.number = number;

        if(number <= 0)
        {
            throw new IllegalArgumentException("Invalid Number");
        }
    }
    abstract double dailyRate();

    @Override
    public String toString() {
        return "Quarto " + number;
    }
    public int getNumber() {
        return number;
    }
}






