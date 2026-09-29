package myexercises;

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "Rock", "Paper", "Scissors" };
        String user;
        String computer;
        String questionContinue;
        int numrandom;
        boolean isRunning = true;
        numrandom = random.nextInt(0, choices.length);
        computer = choices[numrandom];

        do {
            System.out.print("Enter your move(Rock, Paper, Scissors): ");
            user = scanner.nextLine();
            System.out.printf("Computer plays: %s\n", choices[numrandom]);
            user = user.toLowerCase();
            computer = computer.toLowerCase();
            switch (user) {
                case "rock" -> {
                    if (computer.equals("scissors")) {
                        System.out.println("User Wins!");
                    } else if (computer.equals("paper")) {
                        System.out.println("Computer Wins!");
                    } else {
                        System.out.println("Draw!");
                    }
                }
                case "paper" -> {
                    if (computer.equals("rock")) {
                        System.out.println("User Wins!");
                    } else if (computer.equals("scissors")) {
                        System.out.println("Computer Wins!");
                    } else {
                        System.out.println("Draw!");
                    }
                }
                case "scissors" -> {
                    if (computer.equals("rock")) {
                        System.out.println("Computer Wins!");
                    } else if (computer.equals("paper")) {
                        System.out.println("User Wins!");
                    } else {
                        System.out.println("Draw");
                    }
                }

                default -> System.out.println("Please insert Paper,Rock or Scissor!");
            }
            do {
                System.out.println("You want to play again?(yes/no): ");
                questionContinue = scanner.nextLine();
                if (questionContinue.equals("no")) {
                    isRunning = false;
                    scanner.close();
                    return;
                }
            } while (!questionContinue.equals("yes") && !questionContinue.equals("no"));
        } while (isRunning == true);
        scanner.close();
    }
}
