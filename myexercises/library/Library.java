package myexercises.library;

import java.util.ArrayList;

public class Library {
    private ArrayList <LibraryItem> catalog = new ArrayList<>();
    private ArrayList <Loan> actives = new ArrayList<>();
    double totalFines;

    void addItem(LibraryItem catalog)
    {
        this.catalog.add(catalog);
    }

    void listCatalog()
    {
        for(int i = 0; i<catalog.size(); i++)
        {
            String available;
            if(catalog.get(i).isAvailable() == true)
            {
                available = "(Available)";
            }
            else
            {
                available = "(Unavailable)";
            }
            System.out.printf("%d. - %s %s\n", i + 1, catalog.get(i), available);
        }
    }
    void lend(int position, Member member, int days)
    {
        position--;

        if(position < 0 || position > this.catalog.size())
        {
            System.out.println("Invalid position");
            return;
        }
        if(this.catalog.get(position).isAvailable() == false)
        {
            System.out.println("Unavailable Item");
            return;
        }
        if(catalog.get(position) instanceof AgeRestricted age)
        {
            if(age.getMinimumAge() < member.getAge())
            {
                System.out.printf("The minimum age for %s is %d years old\n", catalog.get(position).getTitle(), age.getMinimumAge());
                return;
            }
        }

        Loan loan = new Loan(catalog.get(position), member, days);
        catalog.get(position).markLoaned();
        System.out.printf("Loaned: %s for %s\n", catalog.get(position).getTitle(), loan.getMember().getName());
        this.actives.add(loan);

    }

    void listLoans()
    {
        if(actives.size() == 0)
        {
            System.out.println("Nenhum Emprestimo");
            return;
        }

        else{
            for(int i = 0; i < actives.size(); i++)
            {
                System.out.printf("%d. %s - %s - %d days\n", i+ 1, actives.get(i).getItem().getTitle(), actives.get(i).getMember().getName(), actives.get(i).getDays());
            }
        }
    }

    void returnItem(int position)
    {
        position--;
        if(position < 0 || position >= actives.size())
        {
            System.out.println("Invalid Position\n");
            return;
        }

        else
        {
            Loan remove = actives.remove(position);
            remove.getItem().markReturned();
            totalFines += remove.fine();
            System.out.printf("Devolvido: %s | Multa: %s\n", remove.getItem().getTitle(), Money.format(remove.fine()));
        }
    }

    double getCollectedFines()
    {
        System.out.printf("Total em multas: %s\n", Money.format(totalFines));
        System.out.printf("Itens Cadastrados: %d", actives.size());
        return totalFines;
    }
};
