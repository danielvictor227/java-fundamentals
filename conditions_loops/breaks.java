package conditions_loops;

public class breaks
{
    public static void main(String[] args) {
        // break = break out of a loop(STOP)
        // continue = skip current interation of a loop(SKIP)

        for(int i = 1; i < 10; i++)
        {
           /*  if(i == 5)
            {
                break;
            } */
           if(i == 5)
            {
                continue; // skip the cycle with 5 of the loop
            }
            System.out.print(i + " ");
        }
    }
}