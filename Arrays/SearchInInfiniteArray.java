//Search element in an infinite array

import java.util.*;
public class SearchInInfiniteArray
{
    //TC - O(log n)
    //SC - O(1)
    public static int infiniteSearch(int inf[], int key)
    {
        int low = 0;
        int high = 1;
        while(inf[high] < key)
        {
            low = high;
            //exponential growth
            high = 2*high;
        }
        return Arrays.binarySearch(inf, low, high, key);
    }

    public static void main(String args[])
    {
        int a[] = {19,20,22,224,225,335,670,700,701,702,703,704,705};
        int key = 223;
        System.out.println(infiniteSearch(a, key));
    }    
}
