package conditions_loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) throws InterruptedException {
        // execute some code a CERTAIN amount of times

        /*
         * for(int i = 0;i < 10;i+=3){
         * System.out.println(i);
         * }
         */

       
          Scanner scanner = new Scanner(System.in);
           /*
         * 
         * System.out.println("Enter how many times you want to loop: ");
         * int max = scanner.nextInt();
         * for(int i = 1;i <= max;i++)
         * {
         * System.out.println(i);
         * }
         */

        /*
        
         */
        System.out.println("How many seconds to countown count?");
        int start = scanner.nextInt();
        
        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");
         scanner.close();
    }
}
