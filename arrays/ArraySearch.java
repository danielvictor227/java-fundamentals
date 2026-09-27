package arrays;
import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,9, 2, 8, 3, 5 ,4};
        boolean isFound = false;
        String[] fruits = {"apple", "orange", "banana"};
        /* String target = "pineapple"; */
        String target;

        System.out.print("Enter a fruit to search for: ");
        /* int target = 7; */
        target = scanner.nextLine();
        /* for(int i = 0; i < numbers.length; i++)
        {
            if(target == numbers[i])
            {
                 System.out.println("Element Found at Index " + i);
                 isFound = true;
                 break;
            }
        } */
       for(int i = 0; i < fruits.length; i++)
        {
            if(target.equals(fruits[i]))
            {
                 System.out.println("Element Found at Index " + i);
                 isFound = true;
                 break;
            }
        }
        if(!isFound)
        {
            System.out.println("Element not found in the array");
        }
        scanner.close();
    }
}
