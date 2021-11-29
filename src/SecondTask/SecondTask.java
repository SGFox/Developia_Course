//2. Write a Java program to display **default value** of all **primitive data types** of Java.

package SecondTask;

public class SecondTask
{
    public static void main (String[] args)
    {
        byte b = 127;
        short sh = 32767;
        int x = 2147483000;
        long L = 9000000000000000000L;

        float F = 3.402F;
        double D = 1.79769;

        boolean bool = true;

        char ch = 'G';

        System.out.println("------Primitive Data types------");
        System.out.println("1.Data type: byte - " + b);
        System.out.println("1.Data type: short - " + sh);
        System.out.println("1.Data type: int - " + x);
        System.out.println("1.Data type: long - " + L);
        System.out.println("1.Data type: float - " + F);
        System.out.println("1.Data type: double - " + D);
        System.out.println("1.Data type: boolean - " + bool);
        System.out.println("1.Data type: char - " + ch);
    }
}