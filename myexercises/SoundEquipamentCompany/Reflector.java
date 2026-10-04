public class Reflector extends Equipament
{
    int ledsQuantity;
    Reflector(String name, double dailyValue, int ledsQuantity)
    {
        super(name, dailyValue);
        this.ledsQuantity = ledsQuantity;
    }

    @Override 
    double calcularLocacao(int days)
    {
        if(days < 5)
        {
            return getDailyValue() * days;
        }
          
        return (getDailyValue() * days) * 0.9;
    }

     @Override 
    public String toString()
    {
        return super.toString() + " " + ledsQuantity;
    }
}