//3. Write a program check two strings are equal or not.

package ThirtTask;

import java.util.Scanner;       // импорт сканера

public class ThirtTask
{
    public static void main (String[] args)
    {
        String word1, word2;
        Scanner scan = new Scanner(System.in);

        for (;;)
        {
            System.out.println("\n~ Checking input strings for equality ~ ");
            System.out.println("For exit, type in second line: EXIT ");

            System.out.print("Type first word: ");
            word1 = scan.nextLine();
            System.out.print("Type second word: ");
            word2 = scan.nextLine();

            if (word1.equals(word2))
            {
                System.out.println("First and second word is EQUALS!");
            }
            else System.out.println("First and second word is NOT EQUALS!");
            if (word2.equals("EXIT"))
                break;
        }
    }
}