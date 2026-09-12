import javax.swing.JOptionPane;
import java.util.Scanner;

public class recap2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = sc.nextLine();
        System.out.println("What's your age? ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("What's your favorite food? ");
        String food = sc.nextLine();

        String message = "Your name is " + name+
                          "\n Your age is " +age+
                          "\n Your favorite food is " +food;
        JOptionPane.showMessageDialog(null, message);

        int sum = 40 + 20;
        Integer.parseInt(JOptionPane.showInputDialog("Result of 40 + 20"));
        JOptionPane.showMessageDialog(null,"The Result is 60");
    }
}