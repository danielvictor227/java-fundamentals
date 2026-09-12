package exercices;
public class swap{
    public static void main(String args[])
{
    String x = "Water";
    String y = "Cola";
    
    String 'tmp;
    tmp = x; x = y; y = tmp;

    System.out.println("X: " + x);
    System.out.println("y: " + y);
}
}
