abstract class Equipament{
    private String name;
    private double dailyValue;
    private int id;
    static int counter; 

    Equipament(String name, double dailyValue){
        this.name = name;
        this.dailyValue = dailyValue;
        counter++;
        id = counter;
    }
    Equipament(String name)
    {
        this(name, 50);
    }

    String getName(){
        return this.name;
    }

    double getDailyValue(){
        return this.dailyValue;
    }

    int getId()
    {
        return this.id;
    }

    void setValorDiaria()
    {
        if(getDailyValue() <= 0)
        {
            throw new IllegalArgumentException("The value nedds to be greater than 0");
        }
    }

    abstract double calcularLocacao(int days);

    @Override 
    public String toString()
    {
        return "Id: " + this.id + " " + "Name: " +  this.name + " " + "dailyValue: " + this.dailyValue;
    }
}