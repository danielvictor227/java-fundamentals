package myexercices;

import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {
        double temperature;
        char choice;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");

        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        choice = scanner.next().toUpperCase().charAt(0);
        if (choice != 'C' && choice != 'F') {
            System.out.println("The input was incorrect!");
        } else {
            result = choice == 'C' ? (temperature * 1.8) + 32 : (temperature - 32) / 1.8;
            System.out.printf("Result: %.1f%s", result, choice);
        }
        scanner.close();
    }
}
