package variables;

public class variablescope {
    // where a variable can be accessed
    static int x = 3;
        public static void main(String[] args) {
        int x = 1; // LOCAL

        System.out.println(x);
        doSomething();
    }
        static void doSomething()
        {
            int x = 2; // LOCAL
            System.out.println(x); //java gives priority to local variables if both shares the same name
        }
}
