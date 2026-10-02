package ObjectOrientedProgramming.firsTouch;

public class main {
    public static void main(String[] args) {
        // scanner is a object;

        Car car = new Car();
        
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.model);
        
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        Car car2 = new Car();

        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model); // without the constructors, we can't make the atributtes unique for each car. Because of that, we need the constructors
    }
}
