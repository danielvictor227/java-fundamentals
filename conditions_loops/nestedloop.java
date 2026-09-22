package conditions_loops;

public class nestedloop {
    public static void main(String[] args) {

        // a loop inside another loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
