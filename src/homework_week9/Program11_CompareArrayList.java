package homework_week9;

import java.util.ArrayList;

/** Program 11
 * Declare following two arrylist and compare it
 */
public class Program11_CompareArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> c1 = new ArrayList<String>();                   //Declaring the first ArrayList
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();                   //Declaring the second ArrayList
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println(c1.equals(c2));                               //Comparing two ArrayLists
    }
}
