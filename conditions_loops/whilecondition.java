package conditions;

import java.util.Scanner;

public class whilecondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * String name = "";
         * 
         * while(name.isEmpty()){
         * System.out.println("Enter your name: ");
         * name = scanner.nextLine();
         * }
         * System.out.print("Hello " + name);
         */

        /*
         * while (1 == 1)`
         * {
         * System.out.println("HELP! I'M STUCK IN A LOOP");
         * }
         */
        /*
         * String response = "";
         * 
         * while(!response.equals("Q"))
         * {
         * System.out.println("You are playing a game");
         * System.out.print("Press Q to quit: ");
         * response = scanner.next().toUpperCase();
         * }
         * 
         * System.out.println("You have quit the game");
         */

        /*
         * int age = 0;
         * System.out.print("Enter your age: ");
         * age = scanner.nextInt();
         * do
         * {
         * System.out.println("Your age can't be negative");
         * System.out.println("Enter your age: ");
         * age = scanner.nextInt();
         * }while(age < 0);
         * 
         * System.out.println("You are " +age+ "years old!");
         */

        
        int number = 0;

        do {
            System.out.println("Enter a number bnetween 1 - 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
