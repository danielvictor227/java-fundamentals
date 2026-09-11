import java.util.Scanner;

public class comcalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount;
       
        System.out.print("Insert the initial capital: ");
        double initial = scanner.nextDouble();
        System.out.print("Insert the rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Insert the number of times compounded(Ex: If mounth = 12, if is per year = 1): ");
        int n = scanner.nextInt();
        System.out.print("Insert the times in years: ");
        int times = scanner.nextInt();
      


        rate = rate/100;
        amount = initial * (Math.pow(1 + rate/n, n * times));

        System.out.printf("The final amount is: $%,.2f", amount);

        scanner.close();
    }    
}
