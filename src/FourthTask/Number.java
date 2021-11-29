// 4. Create class Number with only one private instance variable as a double primitive type.
//        - isZero();
//        - isPositive();
//        - isNegative();
//        - isOdd();
//        - isEven();
//        - isPrime();
//-------------------------
//        - getFactorial();
//        - getSqrt();
//        - getSqr();
//        - sumDigits();
//        - getReverse();

package FourthTask;

public class Number
{
    private double number;

    public Number (double number)
    {
        if (number >=1 && number < 250)
        this.number = number;
        else
            throw new RuntimeException("Wrong range");
    }

    public boolean isZero()
    {
        return this.number == 0;
    }

    public boolean isPositive()
    {
        return this.number >= 0;
    }

    public boolean isNegative()
    {
        return this.number < 0;
    }

    public boolean isOdd()
    {
        return this.number % 2 != 0;
    }

    public boolean isEven()
    {
        return this.number % 2 == 0;
    }

    public boolean isPrime()
    {
        return this.number % this.number == 0;
    }

    public long getFactorial()
    {
        int result = 1;
        for (int i = 1; i <= this.number; i++)
        {
            result = result * i;
        }
        return result;
    }

    public double getSqrt()
    {
        return Math.sqrt(this.number);
    }

    public double getSqr()
    {
        double result2;
        result2 = this.number*this.number;
        return result2;
    }

    public int getDigits()
    {
        int sum1 = 0;
        for (double i = this.number; i != 0; i /= 10)
        sum1 += (i % 10);
        return sum1;
    }
//    public double getReverse()
//    {
//
//    }
}
