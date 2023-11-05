package homework_week9;

import java.util.HashMap;
import java.util.Map;

/** Program 9
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Program9_HashMapPeople
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> people = new HashMap();                                        //HashMap declaration
        people.put("Indian",1);
        people.put("American",2);                                                           //.put for HashMap
        people.put("British",3);
        people.put("Nigerian",4);                                                        //Output in Random order
        people.put("Scottish",5);
        people.put("Italian",6);
        people.put("Hungarian",7);
        people.put("Bulgarian",8);
        people.put("Spanish",9);
        System.out.println(people);

        for (Map.Entry<String,Integer> human  :  people.entrySet())              //for each loop to iterate the value from Map
        {
            System.out.println(human.getKey() + "   " +human.getValue());
        }
    }
}
