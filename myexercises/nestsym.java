package myexercises;

import java.util.Scanner;

public class nestsym {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;
        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();
        do{
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);
        if(Character.isLetter(symbol) && Character.isDigit(symbol))
        {
            System.out.println("The character is not a digit, try again!");
        }
        }
        while(Character.isLetter(symbol) && Character.isDigit(symbol));
        for(int i = 0; i<columns;i++)
        {
            for(int j = 0; j<rows;j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
