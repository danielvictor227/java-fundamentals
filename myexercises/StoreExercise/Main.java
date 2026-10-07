import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Product[] catalog = { new Drink("Coca-Cola", 6, 1, 350),
                new Sandwich("X-Burguer", 20, 2, false),
                new Drink("Suco", 8, 3, 500),
                new Sandwich("X-Tudo", 30, 4, true)
        };
        Customer customer = new Customer("Daniel");
        Order order = new Order(customer);

        getUser(catalog, order);

        order.prepareDrinks();
        order.print();

    }

    static void showCatalog(Product[] catalog) {
        for (Product catalogProduct : catalog) {
            System.out.println(catalogProduct);
        }
    }

    static void getUser(Product[] catalog, Order order) {
        int user = 1;
        int quantity = 0;
        while (user != 0) {
            showCatalog(catalog);
            System.out.print("Select a item(0 for exit): ");
            user = scanner.nextInt();
            switch (user) {
                case 0 -> {
                    System.out.println("Exiting...");
                    break;
                }
                case 1 -> {
                    System.out.println("Adding Coca-Cola");
                    System.out.print("How many?: ");
                    quantity = scanner.nextInt();
                    order.add(catalog[0], quantity);
                    continue;

                }
                case 2 -> {
                    System.out.println("Adding X-Burguer");
                    System.out.print("How many?: ");
                    quantity = scanner.nextInt();
                    order.add(catalog[1], quantity);
                    continue;
                }
                case 3 -> {
                    System.out.println("Adding Suco");
                    System.out.print("How many?: ");
                    quantity = scanner.nextInt();
                    order.add(catalog[2], quantity);
                    continue;

                }
                case 4 -> {
                    System.out.println("Adding X-Tudo");
                    System.out.print("How many?: ");
                    quantity = scanner.nextInt();
                    order.add(catalog[3], quantity);
                    continue;

                }
            }
        }
    }
}