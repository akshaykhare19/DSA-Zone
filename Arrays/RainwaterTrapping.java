public class RainwaterTrapping
{
    public static void display(int a[])
    {
        for(int i : a)
        {
            System.out.print(i + " ");
        }
    }

    public static int[] nextGreaterElementOnRight(int a[])
    {
        int n = a.length;
        int res[] = new int[n];
        int maxSoFar = a[n-1];
        for(int i = n-1; i >= 0; i--)
        {
            if(a[i] > maxSoFar)
            {
                maxSoFar = a[i];
            }
            res[i] = maxSoFar;
        }
        return res;
    }

    public static int[] nextGreaterElementOnLeft(int a[])
    {
        int n = a.length;
        int res[] = new int[n];
        int maxSoFar = a[0];
        for(int i = 0; i < n; i++)
        {
            if(a[i] > maxSoFar)
            {
                maxSoFar = a[i];
            }
            res[i] = maxSoFar;
        }
        return res;
    }

    public static int blocksOfWater(int a[])
    {
        int n = a.length;
        int left[] = nextGreaterElementOnLeft(a);
        int right[] = nextGreaterElementOnRight(a);
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            ans += Math.min(left[i], right[i]) - a[i];
        }
        return ans;
    }

    public static void main(String args[])
    {
        int a[] = {3, 1, 2, 4, 0, 1, 3, 2};
        display(nextGreaterElementOnRight(a));
        System.out.println();
        display(nextGreaterElementOnLeft(a));
        System.out.println();
        System.out.println(blocksOfWater(a));
    }    
}
