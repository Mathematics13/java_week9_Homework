package calculate;

import java.util.Scanner;

public class Program1_Main
{
    public static void main(String[] args)                                                                    //Main method
    {
        Scanner input = new Scanner(System.in);                                                             //Scanner declaration
        Calculator c1 = new Calculator();                                                                  //Object creation
        char choice;
       do
       {
        System.out.println("Enter first number : ");
        int a = input.nextInt();                                                                        //first number a
        System.out.println("Enter second number : ");
        int b = input.nextInt();                                                                       //secxond number b
        System.out.println("Enter the symbol you want to operate from  +,-,*,/  : ");
        char symbol = input.next().charAt(0);
        c1.calculateResult(a,b,symbol);
        System.out.println("Would you like to do one more calculation Please enter 'Y' or 'N' : ");
         choice = input.next().charAt(0);
       }
       while(choice=='Y' || choice=='y') ;
        System.out.println("The program is terminated");
        input.close();                                                                            //Closing the scanner object
    }
}
