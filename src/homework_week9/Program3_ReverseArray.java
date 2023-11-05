package homework_week9;

/** Program 3
 * Write a Java program to reverse an array of integer values
 */

public class Program3_ReverseArray
{
    public static void main(String[] args)
    {
        int a[] = new int[4];                                          //Array declaration with fixed size
        a[0] = 68;                                                    //Initializing values for array elements
        a[1] = 79;                                                   //Fixed size
        a[2] = 108;                                                 //Homogenous data type
        a[3] = 520;

        System.out.println("Original Array :  ");
        for(int i=0; i<a.length ; i++)                          //Original array
        {
            System.out.print(a[i] +  " ");
        }
        System.out.println("Reversed Array :  ");            //Reversing the array
        for(int j=a.length-1; j>=0 ; j--)
        {
            System.out.print(a[j] +  " ");
        }
    }
}