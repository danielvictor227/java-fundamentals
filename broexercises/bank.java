package broexercises;

import java.util.Scanner;

public class bank {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU
        while (isRunning) {

            System.out.println("**********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**********************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // GET AND PROCESS USERS CHOICE

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Please insert a valid number");
            }
        }
        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    static double deposit() {
        double amount;
        System.out.print("Enter an amont to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }

    // withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter the amount to be withdraw");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return 0;
        }

        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }
    // EXIT MESSAGE

}
