package classes.wrapper;

public class Main {
    public static void main(String[] args) {
        /* Wrapper classes = Allow primitive values (int, char, double, boolean)
        to be userd as objexts. "Wrap them in an object" 
        Generally, don't wrap primitives unless you need an object.
        Allows use of Collections Framework and static Utility Methods. */

       /*  Integer a = new Intenger(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true); */

        // Autoboxing
        Integer a = 123;
        Double b =3.14;
        Character c ='$';
        Boolean d = true;
        String e = "Pizza"; 

        // Unboxing

        int x = a;

        // Convert Primitives to String
        String f = Integer.toString(123);
        String g = Double.toString(3.14);
        String h = Character.toString('@');
        String i = Boolean.toString(false);

        // Convert String to primitives types
        int as = Integer.parseInt("123");
        double bs = Double.parseDouble("3.14");
        char cs = "Pizza".charAt(0);
        boolean ds = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


        String z = f + g + h + i;
        System.out.println(z);
    }
}
