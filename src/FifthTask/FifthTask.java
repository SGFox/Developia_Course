// 5.  Write calculator that reads 2 number and one operator and calculate according to it and prints result.

package FifthTask;

import java.util.Scanner;

public class FifthTask
{
    public static void main (String[] args)
    {
        double x, y, res1, res2, res3, res4, res5;
        Scanner readNum = new Scanner(System.in);

        System.out.println("\n----------Calculator----------\n");
        System.out.print("Type first number: ");
        x = readNum.nextDouble();
        System.out.print("Type second number: ");
        y = readNum.nextDouble();

        res1 = x + y;
        res2 = x - y;
        res3 = x / y;
        res4 = x * y;
        res5 = x % y;

        System.out.println("\nResult of operation + : " + res1);
        System.out.println("Result of operation - : " + res2);
        System.out.println("Result of operation / : " + res3);
        System.out.println("Result of operation * : " + res4);
        System.out.println("Result of operation % : " + res5);
    }
}
