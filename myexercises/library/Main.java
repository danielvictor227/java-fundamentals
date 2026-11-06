package myexercises.library;

public class Main{
    public static void main(String[] args) {
        Library library = new Library();
        Member member[] = {new Member("Ana", 20), new Member("Pedro", 12)};
        library.addItem(new Book("Dom Casmurro", "Machado de Assis"));
        library.addItem(new Book("O Hobbit", "J.R.R Tolkien"));
        library.addItem(new Dvd("Matrix",16));
        library.lend(3,member[1], 2);
        library.lend(3,member[0], 5);
        library.lend(3,member[0], 1);
        library.lend(1,member[1], 20);
        library.lend(7,member[0], 3);

        library.listCatalog();
        library.listLoans();

        library.returnItem(1);
        library.returnItem(1);
        library.returnItem(1);
    }
}