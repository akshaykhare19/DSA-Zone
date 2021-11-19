public class CalculatePower 
{
    public static int calcPower(int x, int n)
    {
        if(x == 0) return 0;
        if(n == 0) return 1;
        return x * calcPower(x, n-1);
    }

    public static int calcPower2(int x, int n)
    {
        if(x == 0) return 0;
        if(n == 0) return 1;

        if(n%2 == 0) return calcPower2(x, n/2) * calcPower2(x, n/2);
        return calcPower2(x, n/2) * calcPower2(x, n/2) * x;
    }

    public static void main(String[] args)
    {
        System.out.println(calcPower(2, 2));
        System.out.println(calcPower2(2, 7));
    }    
}
