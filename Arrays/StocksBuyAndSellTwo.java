//Find total maximum profit from buying and selling multiple stocks but one at a time

public class StocksBuyAndSellTwo
{
    //TC - O(n)
    //SC - O(1)
    //Very untidy type of approach
    public static int optimal(int a[])
    {
        int n = a.length;
        int localMin = 0, localMax = 0;
        int profit = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                if(a[i] < a[i+1])
                {
                    localMin = a[i];
                }
                else{}
            }
            else if(i == n-1)
            {
                if(a[i] > a[i-1])
                {
                    localMax = a[i];
                }
                else{}
            }
            else if(a[i] <= a[i-1] && a[i] <= a[i+1])
            {
                localMin = a[i];
            }
            else if(a[i] >= a[i-1] && a[i] >= a[i+1])
            {
                localMax = a[i];
            }

            if(localMax != 0 && localMin != 0)
            {
                profit += (localMax-localMin);
                localMax = 0;
                localMin = 0;
            }
        }
        return profit;
    }

    //TC - O(n)
    //SC - O(1)
    //Good and tidy code
    public static int moreOptimal(int a[])
    {
        int n = a.length;
        int profit = 0;
        for(int i = 1; i < n; i++)
        {
            if(a[i] > a[i-1])
            {
                profit += a[i] - a[i-1];
            }
        }
        return profit;
    }

    public static void main(String args[])
    {
        int a[] = {3, 5, 1, 7, 4, 9, 3};
        System.out.println(optimal(a));
        System.out.println(moreOptimal(a));
    }
}
