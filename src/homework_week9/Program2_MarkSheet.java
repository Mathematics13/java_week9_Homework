package homework_week9;

import java.util.Scanner;

/** Program 2
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 *  * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 *  * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 *  * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  * _______________________________
 *  * | |
 *  * | Mark Sheet |
 *  * |_______________________________|
 *  * | Name : Jay |
 *  * | Roll No: 08 |
 *  * |_______________________________|
 *  * | Subjects : Marks |
 *  * |_______________________________|
 *  * | Math : 98 |
 *  * | Science : 90 |
 *  * | English : 85 |
 *  * |_______________________________|
 *  * | Total : 273 |
 *  * |_______________________________|
 *  * | Percentage : 91.0 |
 *  * | Result : Pass |
 *  * | Grade : A+ |
 *  * |_______________________________|
 */
public class Program2_MarkSheet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                           //Scanner declaration
        System.out.println("-------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|              Mark Sheet            |");
        System.out.println("|------------------------------------|");
        System.out.println("        Enter the name :              ");
        String a = scanner.next();
        System.out.println("        Enter the Roll No :           ");
        int b = scanner.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("|       Subject : Marks               |");
        System.out.println("|------------------------------------ |");
        marksheetCalculation();                                             //Calling static method directly
        scanner.close();                                                    //Closing the scanner object

    }

    public static void marksheetCalculation()
    {
        Scanner scanner = new Scanner(System.in);
        int m,s,e ;                                                        //m-Maths Marks, s- Science marks, e-English Marks
        while(true)
        {
            System.out.println("Enter Maths marks  :              ");
            m= scanner.nextInt();
            if(m>=0 && m<=100)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input, Marks should be between o and 100");
            }
        }
        while(true)
        {
            System.out.println("Enter Science marks  :              ");
            s= scanner.nextInt();
            if(s>=0 && s<=100)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input, Marks should be between o and 100");
            }
        }
        while(true)
        {
            System.out.println("Enter English  marks  :              ");
            e= scanner.nextInt();
            if(e>=0 && e<=100)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input, Marks should be between o and 100");
            }
        }
        int total = m+s+e;
        double percentage = (total/300) * 100;

        String grade;
        if(percentage >= 80)
        {
           grade="A+";
        }
        else if(percentage >= 60)
        {
            grade="A";
        }
        else if(percentage >= 50)
        {
            grade="B";
        }
        else
        {
            grade="C";
        }

        String result;
        if(percentage>=35)
        {
            result = "Pass";
        }
        else
        {
            result = "Fail";
        }
        System.out.println("---------------------------------------");
        System.out.println("Total : " +total);
        System.out.println("---------------------------------------");
        System.out.println("Percentage : " + percentage);
        System.out.println("Result     : " +     result);
        System.out.println("Grade      : " +     grade);
        System.out.println("---------------------------------------");
    }
}
