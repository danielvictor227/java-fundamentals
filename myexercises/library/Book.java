package myexercises.library;

public class Book extends LibraryItem {
    private String author;
    
    Book(String title, String author)
    {
        super(title);
        this.author = author;
    }

    @Override 
    int loanDays()
    {
        return 14;
    }

    @Override 
    double dailyFine()
    {
        return 1.00;
    }

     
    @Override
    public String toString() {
        return this.author + super.toString();
    }
}