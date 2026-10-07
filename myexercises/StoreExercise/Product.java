abstract class Product
{
    private String name;
    private double price;
    private int id;

    Product(String name, double price, int id)
    {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    String getName()
    {
        return this.name;
    }

    double getPrice()
    {
        return this.price;
    }
    int getId()
    {
        return this.id;
    }
    abstract double finalPrice(int quantity);

   public String toString()
    {
        return this.id + ": " + this.name + "- " + "$" + this.price + " ";
    }


}