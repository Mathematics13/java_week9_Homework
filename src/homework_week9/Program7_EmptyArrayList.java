package homework_week9;

import java.util.ArrayList;

/** Program 7
 *  Write a Java program to test if an array list is empty or not
 */

public class Program7_EmptyArrayList
{
    public static void main(String[] args)
    {
        ArrayList heterogenous = new ArrayList();                      //Array List declaration of heterogenous data types
        heterogenous.add(56);
        heterogenous.add(2);
        heterogenous.add(98000);                                    //All data types
        heterogenous.add(5436.876f);
        heterogenous.add(234667.8776);                            //Accepts heterogenous datatypes
        heterogenous.add(false);
        heterogenous.add('c');
        heterogenous.add("Mixed");
        heterogenous.add(true);
        heterogenous.add("");
        heterogenous.add(" ");
        System.out.println(heterogenous);
        boolean e = heterogenous.isEmpty();                  //Checking the given ArrayList is empty or not
        System.out.println(e);
        heterogenous.clear();                              //clear() method removes all elements in the ArrayList
        System.out.println(heterogenous);
        System.out.println(e);
    }
}
