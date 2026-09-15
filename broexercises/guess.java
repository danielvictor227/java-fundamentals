package broexercises;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1; int max = 100;
        int randomNumber = random.nextInt(min, max + 1); // the last atribute is exclusive

        System.out.printf("Guess a number between %d-%d: ", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } 
        } while (guess != randomNumber);

        System.out.println("You have won");
        scanner.close();
    }
    
}
