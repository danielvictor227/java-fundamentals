package myexercises;

import java.util.Scanner;
import java.util.Random;

public class dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice;

        System.out.print("Enter the quantity of dice to roll: ");
        dice = scanner.nextInt();
        System.out.println("The Total is " + diceRoll(dice));
        scanner.close();
    }

    static int diceRoll(int roll) {
        int num; int total = 0;
        Random random = new Random();
        for (int i = 0; i < roll; i++) {
            num = random.nextInt(1, 7);
            switch (num) {
                case 1 -> {
                    System.out.println("-----\r\n" + //
                        "|   |\r\n" + //
                        "| o |\r\n" + //
                        "|   |\r\n" + //
                        "-----");
                        total += 1;
                    }
                case 2 -> {
                    System.out.println("-----\r\n" + //
                                                "|o  |\r\n" + //
                                                "|   |\r\n" + //
                                                "|  o|\r\n" + //
                                                "-----\r\n" + //
                                                "");
                    total += 2;
                }
                case 3 -> {
                    System.out.println("-----\r\n" + //
                                                "|o  |\r\n" + //
                                                "| o |\r\n" + //
                                                "|  o|\r\n" + //
                                                "-----");
                    total += 3;
                }
                case 4 ->{
                    System.out.println("-----\r\n" + //
                                                "|o o|\r\n" + //
                                                "|   |\r\n" + //
                                                "|o o|\r\n" + //
                                                "-----");
                    total += 4;
                                    }
                case 5 ->{
                    System.out.println("-----\r\n" + //
                                                "|o o|\r\n" + //
                                                "| o |\r\n" + //
                                                "|o o|\r\n" + //
                                                "-----\r\n" + //
                                                "");
                    total += 5;
                }
                case 6 ->{
                    System.out.println("-----\r\n" + //
                                                "|o o|\r\n" + //
                                                "|o o|\r\n" + //
                                                "|o o|\r\n" + //
                                                "-----");
                    total +=6;
                }
                default -> System.out.println("Error");
            }
        }
        return total;
    }
}
