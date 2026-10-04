import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int counter;
        
        Cliente cliente;
        Equipament[] equipament = { new Microfone("Shure R8", 200, true),
                new caixaDeSom("JBL 915", 400, 1500),
                new Reflector("Luz de Serviço", 900, 200) };

        
        cliente = cadastrarCliente();
        Locacao locacao = new Locacao(cliente);

        
        imprimirEquipamentos(equipament);
        counter = imprimirSwitch(equipament, locacao);
        locacao.list();
        System.out.println();
        System.out.println("The number of itens is: " + counter);
        testar(locacao, equipament);
        System.out.println("The Final value of the Rent is: " + locacao.total());
        System.out.println("Ending...");
    }

    static Cliente cadastrarCliente() {
        String name;
        String telephone;

        System.out.print("Insert your name: ");
        name = scanner.nextLine();
        System.out.print("Insert your telephone: ");
        telephone = scanner.nextLine();

        Cliente cliente = new Cliente(name, telephone);
        return cliente;
    }
    static void imprimirEquipamentos(Equipament[] equipament) {
        for (Equipament equipaments : equipament) {
            System.out.println(equipaments);
        }
    }
    static int imprimirSwitch(Equipament[] equipament, Locacao locacao)
    {
        int counter = 0;
        int days;
        int user = 0; 
        
         do{
        System.out.print("Select a Equipament to rent(ID Number)(0 to exit): ");
        user = scanner.nextInt();
        switch(user)
        {
            case 0: {
                break;
            }
            case 1: {
                System.out.print("Insert the number of days: ");
                days = scanner.nextInt();
               locacao.addItem(equipament[0], days);
                counter++;
                continue;
            }
            case 2: {
                System.out.print("Insert the number of days: ");
                days = scanner.nextInt();
                locacao.addItem(equipament[1], days);
                counter++;
                continue;
            }
            case 3: {
                System.out.print("Insert the number of days: ");
                days = scanner.nextInt();
               locacao.addItem(equipament[2], days);
                counter++;
                continue;
            }
        }
    } while(user != 0);
    return counter;
    }
    static void testar(Locacao locacao, Equipament[] equipament)
    {
        for(int i = 0; i < locacao.counter; i++)
        {
            if(locacao.itemlocacao[i].equipament instanceof Tester n)
            {
                n.test();
            }
           
        }
    }
    }

