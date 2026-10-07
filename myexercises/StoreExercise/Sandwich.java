public class Sandwich extends Product
{
    boolean isDouble;

    Sandwich(String name, double price, int id, boolean isDouble)
    {
        super(name, price, id);
        this.isDouble = isDouble;
    }

    @Override 
    double finalPrice(int quantity)
    {
        if(this.isDouble == true)
        {
        return getPrice() * quantity + (quantity * 5);
        }
        return getPrice() * quantity;
    }

    @Override 
    public String toString()
    {
        return super.toString() + this.isDouble;
    }
    
}