package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
        public static void main(String[] args) {
            /* ArrayList = A resizeble array that stores objects (autoboxing).
            Arrays are fixed in size, but ArrayLists can change */

            ArrayList<String> fruits = new ArrayList<>();

            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Coconut");

            /* fruits.remove(1); */
            /* fruits.set(0, "Pineapple"); */
            /* System.out.println(fruits); */
            System.out.println(fruits.get(1));
            System.out.println(fruits.size());

            Collections.sort(fruits);
            System.out.println(fruits);

            for(String fruit : fruits)
            {
                System.out.println(fruit);
            }
        }
}
