package broexercices;
import java.util.Scanner;
public class tempcnv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();
        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp *9/5) + 32;
        System.out.printf("%.1f%s", newTemp, unit);
        scanner.close();
    }
}
