package homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/** Program 5
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Program5_IterateArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();                                   //ArrayList declaration
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Avocado");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("WaterMelon");
        System.out.println(fruits);
        System.out.println("Using Iterater");
        ListIterator<String> iterate = fruits.listIterator();                            //ArrayList method
        while(iterate.hasNext())                                                        //has next element it will continue
        {
            System.out.println(iterate.next());
        }
    }
}
