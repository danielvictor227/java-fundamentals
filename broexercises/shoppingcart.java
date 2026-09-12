import java.util.Scanner;

public class shoppingcart 
{
    public static void main(String[] args) {
    
    Scanner scanner = new.Scanner(System.in);
    
    System.out.println("What item would you like to buy? ");
    String item = scanner.nextLine();
    System.out.println("What is the price for each? ");
    double price = scanner.nextDouble();
    System.out.println("How may would you like?: ");
    int quatity = scanner.nextInt();
    
    System.out.println("You have bought " +item1+ "/s");
    
    price = price * quantity;
   
    System.out.println("You total is " +price);
}
}
   
