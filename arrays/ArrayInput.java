package arrays;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What # of food do you want?: ");
        
        int user = scanner.nextInt();
        scanner.nextLine();
        String[] foods = new String[user];

        /*
         * foods[0] = "pizza";
         * foods[1] = "taco";
         * foods[2] = "hamburguer";
         */
        for(int i = 0; i < foods.length; i++)
        {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        for (String food : foods) {
            System.out.println(food);
        }
        scanner.close();
    }
}
