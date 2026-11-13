package myexercises.parking;

public abstract class Vehicle {
    private String plate;

    Vehicle(String plate) {
        if (plate.equals(null) || plate.isBlank()) {
            throw new IllegalArgumentException("Invalid Plate");
        }

        this.plate = plate;

    }

    abstract double hourlyRate();

    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return "[" + plate + "]";
    }
}
