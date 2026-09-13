import java.util.Random;

public class random2
{
    public static void main(String[] args) {
        Random random = new Random();

        Double number;
        boolean isHeads;
        isHeads = random.nextBoolean();
    
        if(isHeads)
        {
            System.out.println("HEADS");
        }
        else
        {
            System.out.println("TAILS");
        }
    }
}