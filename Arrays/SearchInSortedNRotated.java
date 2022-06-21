//Search an element in rotated and sorted array

public class SearchInSortedNRotated 
{
    public static int rotatedSearch(int a[], int key, int low, int high)
    {
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(a[mid] == key) return mid;

            if(a[low] < a[mid])
            {
                if(key >= a[low] && key < a[mid])
                {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(key > a[mid] && key <= a[high])
                {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int a[] = {120,130,40,50,90,100,110};
        int key = 120;
        System.out.println(rotatedSearch(a, key, 0, a.length-1));
    }
}
