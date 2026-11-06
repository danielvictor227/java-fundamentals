package myexercises.library;

public  class Money {
    static String format(double value)
    {
       return String.format("R$%.2f", value);
    }
}
