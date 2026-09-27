import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //array = you can think that is a variable that can store more than 1 value;
        
        String[] fruit = {"apple", "orange", "banana", "coconut"};

        /* fruit[1] = "pineapple"; */
        /* int numOfFruit = fruit.length;
        System.out.println(numOfFruit); */

        /* for(int i = 0; i < fruit.length; i++)
        {
            System.out.println(fruit[i]);
        } */
            Arrays.sort(fruit);
           /*  Arrays.fill(fruit, "pineapple"); */

            for(String fruits : fruit) // enhaced for -> for every fruit in my array of fruits...
            {
                System.out.println(fruits); // fruits is be the element that we are comparing in the loop in the that moment
            }
    }
}
