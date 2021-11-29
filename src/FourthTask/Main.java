package FourthTask;

public class Main
{
    public static void main (String[] args)
    {
        var num1 = new Number(25);

        System.out.println("Is 25 ZERO: " + num1.isZero());
        System.out.println("Is 25 POSITIVE: " + num1.isPositive());
        System.out.println("Is 25 NEGATIVE: " + num1.isNegative());
        System.out.println("Is 25 ODD: " + num1.isOdd());
        System.out.println("Is 25 EVEN: " + num1.isEven());
        System.out.println("Is 25 PRIME: " + num1.isPrime());
        System.out.println("Get Factorial 25: " + num1.getFactorial());     //ERROR!
        System.out.println("Get Sqrt 25: " + num1.getSqrt());
        System.out.println("Get Sqr 25: " + num1.getSqr());
        System.out.println("Get Digits Sum 25: " + num1.getDigits());
    }
}