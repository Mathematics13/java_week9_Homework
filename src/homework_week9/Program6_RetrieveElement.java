package homework_week9;

import java.util.ArrayList;

/** Program 6
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program6_RetrieveElement
{
    public static void main(String[] args)
    {
        ArrayList hospital = new ArrayList();                                    //ArrayList declaration
        hospital.add("Doctor");
        hospital.add("Nurse");
        hospital.add("Patients");
        hospital.add("Attenders");
        hospital.add("Helpers");
        hospital.add("Reception");
        hospital.add("Medicines");
        hospital.add("Pharmacy");
        System.out.println(hospital.get(6));                                    //To retrieve an element at a specified index from a given arrayList
    }
}
