public class SumOfNNumbers 
{
    static int sum = 0;
    public static void main(String args[])
    {
        System.out.println(sumOfNumbers(5));
    }   
    
    static int sumOfNumbers(int n)
    {
        if(n == 0) return sum;
        sumOfNumbers(n-1);
        sum += n;
        System.out.println("sum = " + sum + " : n = " + n);
        return sum;
    }

}
