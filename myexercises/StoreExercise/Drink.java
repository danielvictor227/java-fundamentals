public class Drink extends Product implements Chillable {
    int ml;

    Drink(String name, double price, int id, int ml) {
        super(name, price, id);
        this.ml = ml;
    }

    @Override
    double finalPrice(int quantity) {
        if (quantity >= 3) {
            return (getPrice() * quantity) * 0.9;
        }
        return getPrice() * quantity;
    }

    @Override 
    public String toString()
    {
        return super.toString() + this.ml + "ml";
    }

    @Override 
    public void chill()
    {
        System.out.println("Chilling " + getName() + " " + ml + "ml");
    }
}