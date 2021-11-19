public class Factorial
{
    static int fact = 1;
    public static void calcFactorial(int n)
    {
        if(n == 0 || n == 1)
        {
            System.out.println(fact);
            return;
        }
        fact *= n;
        calcFactorial(n-1);
    }

    public static void main(String[] args)
    {
        calcFactorial(0);
    }
}