public class Gcd 
{
    public static void main(String[] args)
    {
        System.out.println(gcd(10,25));
    }

    //using recursion
    static int gcd(int a, int b)
    {
        System.out.println("gcd(" + a + "," + b + ")");
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
