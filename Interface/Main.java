package Interface;

public class Main {
    public static void main(String[] args) {
                /* Interface: A blueprint for a class that specifies a set of abstract methods
                that implementing classes MUST define.
                Supports #multiple inheritance-like behavior#. -- is very similiar an abstract class.  */
                Rabbit rabbit = new Rabbit();
                Hawk hawk = new Hawk();
                Fish fish = new Fish();


                fish.hunt();
                fish.flee();
                hawk.hunt();
                rabbit.flee();
                
    }
}
