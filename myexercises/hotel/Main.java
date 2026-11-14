package myexercises.hotel;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Guest ana = new Guest("Ana", "111");
        Guest bruno = new Guest("Bruno", "222");
        Guest carla = new Guest("Carla", "333");
        Guest davi = new Guest("Davi", "444");

        // 1. Quartos
        hotel.addRoom(new StandardRoom(101));
        hotel.addRoom(new StandardRoom(102));
        hotel.addRoom(new SuiteRoom(201));
        try {
            hotel.addRoom(new SuiteRoom(101));
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 2. Check-ins válidos
        try {
            hotel.checkIn(ana, 101, 3);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkIn(bruno, 201, 2);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 3. Check-ins inválidos
        try {
            hotel.checkIn(carla, 101, 1);   // quarto ocupado
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkIn(carla, 305, 1);   // quarto não existe
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkIn(ana, 102, 2);     // hóspede já hospedado
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkIn(davi, 102, 0);    // diárias inválidas
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 4. Carla no 102
        try {
            hotel.checkIn(carla, 102, 4);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 5. Ocupação e quartos livres
        System.out.println("Ocupação: " + hotel.occupancy());
        hotel.listAvailableRooms();

        // 6. Check-outs
        try {
            hotel.checkOut("222");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkOut("999");          // não existe
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 7. Quartos livres
        hotel.listAvailableRooms();

        // 8. Davi na suíte
        try {
            hotel.checkIn(davi, 201, 1);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 9. Check-out com String nova (testa == vs equals) e repetido
        try {
            hotel.checkOut(new String("111"));
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            hotel.checkOut("111");          // Ana já saiu
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 10. Validações nos construtores
        try {
            new StandardRoom(0);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            new Guest(" ", "555");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 11. Resumo final
        System.out.println("Ocupação: " + hotel.occupancy());
        hotel.listAvailableRooms();
        System.out.println("Faturamento: " + String.format("R$ %.2f", hotel.getRevenue()));
       
    }
}