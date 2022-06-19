public class StocksBuyAndSellOne 
{
    //TC - O(n^2)
    //SC - O(1)
    public static int brute(int a[])
    {
        int maxProfit = Integer.MIN_VALUE;
        int buy = 0, sell = 0;
        for(int i = 0; i < a.length; i++)
        {
            int profit = Integer.MIN_VALUE;
            for(int j = i; j < a.length; j++)
            {
                profit = a[j] - a[i];
                if(maxProfit < profit){
                    maxProfit = profit;
                    buy = i;
                    sell = j;
                }
            }
        }
        System.out.println("Buy on " + buy + "th day and sell on " + sell + "th day.");
        return maxProfit;
    }

    //TC - O(n)
    //SC - O(n)
    public static int optimal(int a[])
    {
        int n = a.length;
        int aux[] = new int[n];
        int maxSoFar = 0;
        for(int i = n-1; i >= 0; i--)
        {
            if(a[i] > maxSoFar)
            {
                maxSoFar = a[i];
            }
            aux[i] = maxSoFar;
        }
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, aux[i]-a[i]);
        }
        return max;
    }

    //TC - O(n)
    //SC - O(1)
    public static int mostOptimal(int a[])
    {
        int n = a.length;
        int maxSoFar = 0;
        int buy = 0, sell = 0;
        int maxProfit = 0;
        for(int i = n-1; i >= 0; i--)
        {
            if(a[i] > maxSoFar)
            {
                sell = i;
                maxSoFar = a[i];
            }
            int profit = maxSoFar - a[i];
            if(profit > maxProfit)
            {
                maxProfit = profit;
                buy = i;
            }
        }
        System.out.println("Buy on " + buy + "th day and sell on " + sell + "th day.");
        return maxProfit;
    }

    public static void main(String args[])
    {
        int a[] = {1, 3, 5, 9, 2, 7, 5};
        System.out.println(brute(a));
        System.out.println(optimal(a));
        System.out.println(mostOptimal(a));
    }    
}
