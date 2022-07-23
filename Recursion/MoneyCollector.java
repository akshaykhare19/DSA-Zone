//Start from (0,0) and reach to (n-1,n-1) through a path in which one can collect the maximum money
//Any position (i,j) has A[i][j] money 

public class MoneyCollector
{
    private static int helper(int a[][], int n, int i, int j, int money, int maxCollection)
    {
        if(i>=n || j>=n) return 0;

        if(i==n-1 && j==n-1)
        {
            maxCollection = Math.max(money+a[i][j], maxCollection);
            // System.out.println("max " + maxCollection);
            return maxCollection;
        }

        money+=a[i][j];
        int down = helper(a, n, i+1, j, money, maxCollection);
        int right = helper(a, n, i, j+1, money, maxCollection);
        money-=a[i][j];

        return Math.max(down, right);
    }

    private static int collectMaxMoney(int n, int a[][])
    {
        int max = Integer.MIN_VALUE;
        return helper(a, n, 0, 0, 0, max);
        // return max;
    }

    public static void main(String args[])
    {
        int n = 4;
        int a[][] = {{1,7,5,2},{5,12,3,6},{100,9,23,16},{16,4,5,9}};
        System.out.println("Maximum Collected Money : " + collectMaxMoney(n, a));

        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Maximum Collected Money : " + collectMaxMoney(3, b));
    }    
}
