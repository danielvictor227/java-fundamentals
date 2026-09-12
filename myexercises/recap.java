import java.util.Scanner;
import javax.swing.JOptionPane;
public class recap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = sc.nextLine();
        System.out.println("My name is " +name);

        String name2 = JOptionPane.showInputDialog("Insert Your name");
        JOptionPane.showMessageDialog(null,"Your name is " + name2);
        int sum = Integer.parseInt(JOptionPane.showInputDialog("Insert your age: "));
        sum = sum + 45;
        JOptionPane.showMessageDialog(null,"Your age is " +sum);
    }
}