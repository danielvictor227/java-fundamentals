package myexercises.parking;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3);
        Vehicle[] vehicles = { new Car("ABC1234"), new Motorcycle("MOT0001"), new ElectricCar("ELE2026"),
                new Car("XYZ9876") };

        for (Vehicle vehicle : vehicles) {
            try {
                parkingLot.enter(vehicle);
            } catch (RuntimeException e) {
                System.out.println("Erro " + e.getMessage());
            }
        }
        
        parkingLot.freeSpots();
        parkingLot.listVehicles();

        try {
            parkingLot.exit(vehicles[0].getPlate(), 3);
        } catch (RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }
        try {
            parkingLot.exit("ele2026", 2);
        } catch (RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }
        try {
            parkingLot.exit(vehicles[1].getPlate(), 0);
        } catch (RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }
        try {
            parkingLot.exit("AAA000", 2);
        } catch (RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }

        try {
            parkingLot.enter(vehicles[3]);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            parkingLot.enter(vehicles[1]);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            parkingLot.exit(vehicles[1].getPlate(), 5);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            new Car(" ");
        } catch (RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }

        parkingLot.freeSpots();
        parkingLot.getRevenue();
    }
}
