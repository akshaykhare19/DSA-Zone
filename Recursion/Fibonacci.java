public class Fibonacci 
{
    public static void fibonacci(int a, int b, int n)
    {
        if(n == 0) return;

        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
    }

    public static void main(String[] args)
    {
        int n = 8;
        System.out.print("0 1 ");
        fibonacci(0, 1, n-2);
    }   
}
