public class caixaDeSom extends Equipament implements Tester
{
    int potWatts;

    caixaDeSom(String name, double dailyValue, int potWatts)
    {
        super(name, dailyValue);
        this.potWatts = potWatts;
    }

    @Override 
    double calcularLocacao(int days)
    {
        if(potWatts <= 1000)
        {
            return getDailyValue() * days + potWatts;
        }
        return (getDailyValue() * days + potWatts) * 1.2;
    }
    @Override 
    public void test()
    {
        System.out.printf("Testing %s de %dW...\n", getName(), potWatts);
    }
    @Override 
    public String toString()
    {
        return super.toString() + " " + potWatts +"W";
    }
}