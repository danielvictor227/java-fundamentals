package Interface;

public class Fish implements Prey, Predator // This is one key difference between the interface and the abstract class, with using interfaces, we can use two parents at the same time
    {
        @Override 
        public void flee()
        {
            System.out.println("The fish is swimming away");
        }

        @Override 
        public void hunt()
        {
            System.out.println("The fish is hunting");
        }
}
