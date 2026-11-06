package myexercises.library;

public class Dvd extends LibraryItem implements AgeRestricted {
    private int minimumAge;
    
    Dvd(String title, int minimumAge)
    {
        super(title);
        this.minimumAge = minimumAge;
    }

    @Override 
    int loanDays()
    {
        return 3;
    }

    @Override 
    double dailyFine()
    {
        return 2.50;
    }

    @Override 
    public int getMinimumAge() 
    {
        return minimumAge;
    }
     
    @Override
    public String toString() {
        return super.toString() + " (+" + minimumAge + ")";
    }
}