package myexercises;

import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomInt;
        String user;
        int usernumber = 0;
        System.out.println("Number Guessing Game");
        System.out.println("Press Q to quit!");
        randomInt = random.nextInt(min, max);
        do {
            System.out.printf("Insert a number between %d-%d: ", min, max);

            user = scanner.next().toUpperCase();
            if (user.matches("[0-9]+")) {
                usernumber = Integer.parseInt(user);
                if (usernumber > 100 || usernumber < 1) {
                    System.out.println("The inserted number is out of scope");
                    continue;
                }
                if (usernumber != randomInt) {
                    if (usernumber > randomInt) {
                        System.out.println("TOO HIGH!!! TRY AGAIN!");
                    } else if (usernumber < randomInt) {
                        System.out.println("TOO LOW!! TRY AGAIN!");
                    }
                }
            } else {
                if (user.equals("Q")) {
                    System.out.println("Quiting...");
                    break;
                } else {
                    System.out.println("Please digit a integer");
                }

            }
        } while (usernumber != randomInt);

        if (usernumber == randomInt) {
            System.out.println("You're right! Congrats!!!!");
        }

        scanner.close();
    }
}
