package myexercises.library;

abstract class LibraryItem {
    private String title;
    private int id;
    private boolean available = true;
    static int counter;

    LibraryItem(String title)
    {
        this.title = title;
        counter++;
        this.id = counter;
    }

    static int getTotalCreated()
{
    return counter;    
}

public String getTitle() {
    return this.title;
}

public int getId()
{
    return this.id;
}

public boolean isAvailable()
{
    if(available == true)
    {
    return available;
    }

    else{
        return available;
    }
}

void markLoaned()
{
    available = false;
    System.out.println("The item is already loaned");
}

void markReturned()
{
    available = true;
    System.out.println("The item was returned successfully"); 
}

abstract int loanDays();
abstract double dailyFine();

@Override
public String toString() {
    return "[#" + getTotalCreated() + "] " + this.title;
}

}




