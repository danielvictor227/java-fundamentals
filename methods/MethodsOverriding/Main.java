package methods.MethodsOverriding;

public class Main {
    public static void main(String[] args) {
        /* Method Overriding = When a subclass provides its own
        implementation of a method that is already defined.
        Allows for code reusability and give specif implementations. */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move(); // but fish doesn't move. So we have to create a override method that say this.
        
        
    }
}
