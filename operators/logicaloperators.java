package operators;

import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        // &&
        // ||
        // ! */
        double temp = -10;
        boolean isSunny = false;

        /*
         * if(temp <= 30 && temp >= 0 && isSunny){
         * System.out.println("The weather is GOOD");
         * System.out.println("It is Sunny outside");
         * }
         * else if(temp <= 30 && temp >= 0 && !isSunny)
         * {
         * System.out.println("The weather is GOOD");
         * System.out.println("It is CLOUDY outside");
         * }
         * else if(temp > 30 || temp < 0)
         * {
         * System.out.println("The weather is bad!");
         * }
         */

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        Scanner scanner = new Scanner(System.in);

        String username;
        System.out.println("Enter your new username: ");
        username = scanner.nextLine();
        if(username.length() < 4 || username.length() > 12)
        {
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }
    }
}
