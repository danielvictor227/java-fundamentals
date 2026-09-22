package myexercises;

import java.util.Scanner;

public class banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double balance;
        int user;
        boolean isRunning = true;
        System.out.println("******************");
        System.out.print("Insert Your Current Balance: ");
        balance = scanner.nextDouble();
        do{
        callMenu();
        System.out.println("Enter your choice (1-4): ");
        user = scanner.nextInt();
        
        switch(user)
        {
            case 1 -> System.out.printf("Current value: %.2f\n", balance);
            case 2 -> balance = depositMoney(scanner, balance);
            case 3 -> balance = withdrawMoney(scanner, balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
    }while(isRunning == true);
    scanner.close();
    }

    static void callMenu()
    {
        System.out.println("******************");
        System.out.println("BANKING PROGRAM");
        System.out.println("******************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("******************");
    }

    static double depositMoney(Scanner scanner, double number)
    {
        double deposit;
        System.out.print("Insert the quantity that you wants to deposit: ");
        deposit = scanner.nextDouble();
        number += deposit;
        
        return number;

    }

    static double withdrawMoney(Scanner scanner, double number)
    {
        double withdraw;
        System.out.println("Insert the quantity that you wants to withdraw: ");
        withdraw = scanner.nextDouble();
        number -= withdraw;
        return number;
    }
}