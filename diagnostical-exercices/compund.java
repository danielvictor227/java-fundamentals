import java.util.Scanner;

public class compund
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        System.out.print("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double rate = scanner.nextDouble();
        rate /= 100;
        System.out.print("Enter the # of times compounded per year: ");
        int capitalization = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        int time = scanner.nextInt();
        amount = principal * (Math.pow(1 + rate/capitalization, capitalization * time));
        System.out.printf("The amount after %d years is $%.2f", time, amount);
        
        scanner.close();
    }
}