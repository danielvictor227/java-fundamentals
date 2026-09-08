package switches;

import java.util.Scanner;

public class enhancedswitches {
    // Enhanced switch = A replacement to many else if statements
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the day of the week: ");
        String day = scanner.nextLine().toLowerCase();
        
        switch (day) {

            case "wednesday","thursday","friday", "monday","tuesday" -> System.out.println("It is a weekday");
            case "saturday","sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
    }
