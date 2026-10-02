package polymorphism.RuntimePolymorphism;

public class Dog extends Animal {
    @Override 
    void speak(){
        System.out.println("The dogs goes *woof*");
    }
}
