import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        // HYPOTENUSE c = Math.sqrt(a + b)
        
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("enter the length of side A");
        a = scanner.nextDouble();
    
        System.out.println("enter the length of side B");
        b = scanner.nextDouble();
    
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm²");

        scanner.close();
    }
}
