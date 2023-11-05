package homework_week9;

import java.util.ArrayList;

/** Program 4
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program4_ArrayListColours
{
    public static void main(String[] args)
    {
        ArrayList<String> listColours= new ArrayList();               //ArrayList declaration
        listColours.add("Violet");                                   //Using add method in ArrayList
        listColours.add("Indigo");
        listColours.add("Blue");
        listColours.add("Green");
        listColours.add("Yellow");
        listColours.add("Orange");
        listColours.add("Red");
        listColours.add("Black");
        listColours.add("White");
        listColours.add("Grey");

        System.out.println( listColours);
        for ( String colours   : listColours  )                   //foreach loop
        {
            System.out.print(colours + "  ");
        }
    }
}
