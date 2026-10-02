package ObjectOrientedProgramming.Constructors.OverloadConstructors;

public class Overload {
    /*
     * overloaded constructor = Allow a class to have multiple
     * constructors with different parameter lists
     * Enable objects to be initialized in various ways.
     */
    public static void main(String[] args) {
        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "PStar@aol.com");
        User user3 = new User("Sandy", "Scheeks@gmail.com", 27);
        User user4 = new User();

        System.out.print(user1.username);
        System.out.print(" " + user1.email);
        System.out.println(" " + user1.age);

        System.out.print(user2.username);
        System.out.print(" " + user2.email);
        System.out.println(" " + user2.age);

        System.out.print(user3.username);
        System.out.print(" " + user3.email);
        System.out.println(" " + user3.age);

        System.out.print(user4.username);
        System.out.print(" " + user4.email);
        System.out.println(" " + user4.age);
    }
}
