package myexercices;

import java.util.Scanner;

public class weight{
    public static void main(String[] args) {
        
        double kg;
        double lb;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a option: ");
        int option = scanner.nextInt();
        if(option == 1)
        {
            System.out.print("Insert the weight in lbs: ");
            lb = scanner.nextDouble();
            kg = lb * 0.4536;
            System.out.printf("The Weight in kg is: %.2f kgs\n", kg);
        }

        else if(option == 2)
        {
            System.out.print("Insert the Weight in kgs: ");    
            kg = scanner.nextDouble();
            lb = kg * 2.2046;
            System.out.printf("The Weight in lbs is: %.2f lbs\n", lb);
        }

        else
        {
            System.out.println("This option doesn't exists.");
        }
        scanner.close();
    }
}