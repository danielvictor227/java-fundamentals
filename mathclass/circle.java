import java.util.Scanner;

public class circle
{
    public static void main(String[] args) {
        // circumference = 2 * Math.PI * radius;
        // area = math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("Circumference is: %.1f\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);
        scanner.close();
    }
}   
