public class Microfone extends Equipament implements Tester
{
    boolean nonWired;
    
    Microfone(String name, double dailyValue, boolean nonWired){
        super(name, dailyValue);
        this.nonWired = nonWired;
        }
    public String isWired(boolean nonWired)
    {
        String isWired = (nonWired == false) ? "Com fio" : "Sem fio";
        return isWired;
    }

    @Override 
    double calcularLocacao(int days)
    {
        return getDailyValue() * days + 15;
    }

    @Override 
    public void test()
    {
        System.out.printf("Testing %s...\n", this.getName());
    }

     @Override 
    public String toString()
    {
         return super.toString() + " " + isWired(nonWired);
    }
}