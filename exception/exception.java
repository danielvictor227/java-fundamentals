package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        /* Exception = An event that interrupts the normal flow of a program
        (Dividing by zero, file not found, mismatch input type) Surrond any dangerous code with a try{} block
        try{}, catch{}, finally{} */

        Scanner scanner = new Scanner(System.in);
        
        try (Scanner scanner = new Scanner(System.in)){ // java will gonna close automally the resources when all is done.
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch(InputMismatchException e){
            System.out.println("PLEASE DIGIT A NUMBER");
        }
        catch(Exception e)
        {
            //SAFETY NET - only do this in the end, when something happen and you don't antecippate
            System.out.println("Something went wrong");
        }
        finally{ //always gonna execute, having a exception or not. Generally using for closing garbage
            scanner.close();
            System.out.println("This always executes");
        }
    }
}
