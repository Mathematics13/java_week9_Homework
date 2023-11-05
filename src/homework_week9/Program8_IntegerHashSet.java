package homework_week9;

import java.util.HashSet;

/** Program 8
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set.
 * (Hint: use for loop and if else)
 */
public class Program8_IntegerHashSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> intNumbers = new HashSet<>();
        intNumbers.add(14);
        intNumbers.add(4);
        intNumbers.add(53);
        intNumbers.add(7);
        intNumbers.add(20);
        intNumbers.add(8);
        System.out.println("The given numbers in the Hashset : " + intNumbers);
        System.out.println("The numbers between 1 and 10 in the Hashset : ");
        for (int i = 1; i <= 10; i++)
        {
            if(intNumbers.contains(i))
            {
                System.out.println(i);
            }
        }

    }
}
