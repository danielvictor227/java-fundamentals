import java.util.Scanner;
public class ifst {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        ;
        System.out.print("Write your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your name?: ");
        String name = scanner.nextLine();

        System.out.println("Are you a Student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        // Group 1
        if(name.isEmpty())
        {
            System.out.println("You did't enter your name😡");
        }
        else
        {
            System.out.println("Hello, " + name+ "!");
        }
     
        if(age >= 65)
        {
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        
        else if(age < 0)
        {
            System.out.println("You haven't born yet!");
        }
        else if(age == 0)
        {
            System.out.println("You are a baby!");
        }
        else
        {
            System.out.println("You are a Child!");
        }

        if(isStudent)
        {
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You not are a student!");
        }
        scanner.close();
    }
}
