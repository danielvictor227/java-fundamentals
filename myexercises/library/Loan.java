package myexercises.library;

public class Loan {
    private LibraryItem item;
    private Member member;
    private int days;

    Loan(LibraryItem item, Member member, int days)
    {
        this.item = item;
        this.member = member;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public LibraryItem getItem() {
        return item;
    }

    public Member getMember() {
        return member;
    }

    double fine()
    {
        if(days > item.loanDays())
        {
            return (days - item.loanDays()) * item.dailyFine();
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return item.getTitle();
    }
}


