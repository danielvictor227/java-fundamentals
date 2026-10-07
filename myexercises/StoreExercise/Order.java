public class Order {
    int maxItens = 4;
    Customer customer;
    OrderItem[] items;
    int counter;

    Order(Customer customer) {
        this.customer = customer;
        items = new OrderItem[maxItens];
    }

    double total() {
        double temp = 0;

        for (int i = 0; i < counter; i++) {
            temp += items[i].subtotal();
        }
        return temp;
    }

    void add(Product product, int quantity) {

        if (counter == maxItens) {
            System.out.println("PEDIDO CHEIO");
            return;
        }
        items[counter] = new OrderItem(product, quantity);
        counter++;
    }

    void print() {
        System.out.println();
        System.out.println("Pedido:");
        System.out.printf("Cliente: %s\n", customer.name);
        for (int i = 0; i < counter; i++) {
            System.out.println(items[i].product + " " + items[i].quantity + "x");
            System.out.println(items[i].subtotal());
          }
           System.out.println("Total: " +total());
    }
        void prepareDrinks()
        {

            for(int i = 0; i < counter; i++)
            {
                if(items[i].product instanceof Chillable n)
                {
                    n.chill();
                }
            }
        }
    }

