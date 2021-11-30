// 6. Write a Java program in a class named SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure.

package SixthTask;

public class SixthTask
{
    public static void main (String[] args)
    {

        String slash = "\\";
        String exc = "!";
        String backSlash = "/";
        int i, j;

        for (i = 0, j = 22; i <= 10; i=i+2, j=j-4)
        {
            System.out.println(slash.repeat(i) + exc.repeat(j) + backSlash.repeat(i));
        }
    }
}
