package ObjectOrientedProgramming.arrayOfObjects;

public class Main {
    public static void main(String[] args) {
     /*    Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Dodge", "Blue");
        Car car3 = new Car("Corvette", "Yellow"); */

      /*   Car[] cars = {car1,car2,car3}; */
        Car[] cars = {new Car("Mustang", "Red"), 
        new Car("Corvette", "Blue"),
        new Car("Charger", "Yellow")};
        
 
        for(Car car : cars)
        {
            car.color = "Black";
        }
        
        for(Car car : cars)
        {
            car.drive();
        }

    }
}
