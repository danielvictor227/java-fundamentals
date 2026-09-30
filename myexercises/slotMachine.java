package myexercises;

import java.util.Scanner;
import java.util.Random;

public class slotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = { "🍉", "🍒", "​🍋", "🔔​​", "​⭐" };
        int currentBalance = 100;
        int winningCondition = 3;
        String[] spin = new String[winningCondition];
        int timesToPlay = 3;
        char isRunning = 'y';

        int userBet;
        int randomResult;

        System.out.println("**********************");
        System.out.println("Welcome to Java Slots!");
        System.out.println("**********************");
        System.out.print("Symbols: ");
        for (String symbol : symbols) {
            System.out.printf("%s ", symbol);
        }
        System.out.println();

        do {
            System.out.println("Current balance: $" + currentBalance);
            do{
            System.out.print("Place your bet amount: ");
            userBet = scanner.nextInt();
                if(userBet > currentBalance)
                {
                    System.out.println("The number is bigger than the current balance!");
                }
            } while(userBet > currentBalance);
            
            System.out.println("Spinning...");
            for (int j = 0; j < winningCondition; j++) {
                randomResult = random.nextInt(symbols.length);
                spin[j] = symbols[randomResult];
            }
            currentBalance = moneycalculator(userBet, currentBalance, spin);
            System.out.print("Do you want to play again? (Y/N): ");
            isRunning = scanner.next().toLowerCase().charAt(0);
        } while (isRunning == 'y' || currentBalance <= 0);

        System.out.println("GAME OVER! Your final balance is: $" + currentBalance);
        scanner.close();
    }

    static int moneycalculator(int bet, int balance, String[] spin) {
        if (spin[0].equals(spin[1]) || spin[1].equals(spin[2])) {
            balance += bet * 5;
            System.out.println("**********************");
            for (String spins : spin) {
                System.out.print(spins + " | ");
            }
            System.out.println();
            System.out.println("**********************");
            System.out.println("You Won: $" + (bet * 5));
        } else if (spin[0].equals(spin[1]) && spin[1].equals(spin[2])) {
            balance += bet * 10;
            System.out.println("**********************");
            for (String spins : spin) {
                System.out.print(spins + " | ");
            }
            System.out.println();
            System.out.println("**********************");
            System.out.println("You Won: $" + (bet * 10));
        } else {
            balance -= bet * 3;
            System.out.println("**********************");
            for (String spins : spin) {
                System.out.print(spins + " | ");
            }
            System.out.println();
            System.out.println("**********************");
            System.out.println("You Lose: $" + (bet * 3));
        }
        return balance;
    }
}
