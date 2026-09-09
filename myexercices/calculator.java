import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstnum;
        double lastnum;
        double result;
        String operator;

        System.out.print("Enter the first number: ");
        firstnum = scanner.nextDouble();
        System.out.print("Enter an operator (+,-,*,/,^): ");
        operator = scanner.next();
        System.out.print("Enter the last number: ");
        lastnum = scanner.nextDouble();

        if (lastnum == 0) {
            System.out.println("Cannot divide by zero!");
        }

        switch (operator) {
            case "+" -> result = firstnum + lastnum;
            case "-" -> result = firstnum - lastnum;
            case "*" -> result = firstnum * lastnum;
            case "/" -> result = firstnum / lastnum;
            case "^" -> result = Math.pow(firstnum, lastnum);
            default -> {
                System.out.println("This operator does't exists or is not mentioned in the calculator");
                scanner.close();
                return;
            }
        }
        if(result % 1 != 0)
        {
            System.out.printf("The result is: %.2f", result);
        }
        else{
        System.out.printf("The result is: %.0f", result);
        }
        scanner.close();

    }
}