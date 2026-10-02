package polymorphism;

public class Main {
    public static void main(String[] args) {
        /* Polymorphism =   "POLY" = "MANY"
                            "MORPH = "SHAPE
                            Objects can identify as other objects
                            Objects can be treated as objects of a common surfaces */

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};


        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
/* 
        car.go();
        bike.go();
        boat.go(); */
    }    
}
